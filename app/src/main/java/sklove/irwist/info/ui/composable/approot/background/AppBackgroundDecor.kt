package sklove.irwist.info.ui.composable.approot.background

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import sklove.irwist.info.ui.composable.approot.background.PlacedIcon
import sklove.irwist.info.ui.composable.approot.background.placeBackgroundIcons
import sklove.irwist.info.ui.composable.approot.background.points.BackgroundAnchors
import kotlin.random.Random

private data class RotateTiming(
    val maxDegrees: Float,
    val rotateDurationMs: Int,
    val fadeDurationMs: Int,
    val fadeDelayMs: Int,
)

@Composable
fun AppBackgroundDecor(modifier: Modifier = Modifier) {
    val items = remember {
        val random = Random(System.nanoTime())
        placeBackgroundIcons(random, BackgroundAnchors).map { item ->
            item to RotateTiming(
                maxDegrees = 8f + random.nextInt(10),
                rotateDurationMs = 2200 + random.nextInt(2200),
                fadeDurationMs = 2500 + random.nextInt(2000),
                fadeDelayMs = random.nextInt(2000),
            )
        }
    }

    Box(modifier = modifier) {
        items.forEach { (item, timing) -> RotateDecorIcon(item, timing) }
    }
}

@Composable
private fun BoxScope.RotateDecorIcon(item: PlacedIcon, timing: RotateTiming) {
    val transition = rememberInfiniteTransition(label = "menuBackgroundRotate")

    val angle by transition.animateFloat(
        initialValue = -timing.maxDegrees,
        targetValue = timing.maxDegrees,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = timing.rotateDurationMs, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "rotate",
    )

    val fade by transition.animateFloat(
        initialValue = 0.3f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = timing.fadeDurationMs,
                delayMillis = timing.fadeDelayMs,
                easing = LinearEasing,
            ),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "fade",
    )

    Icon(
        imageVector = item.icon,
        contentDescription = null,
        tint = MaterialTheme.colorScheme.onBackground,
        modifier = Modifier
            .align(item.anchor)
            .size(item.size)
            .graphicsLayer {
                rotationZ = angle
                alpha = item.baseAlpha * fade
            },
    )
}
