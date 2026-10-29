package sklove.irwist.info.ui.composable.screen.game.streak

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import sklove.irwist.info.R
import sklove.irwist.info.ui.composable.screen.game.streak.StreakItem
import sklove.irwist.info.ui.theme.LocalDimens

/** A plain rounded badge — the number and an explicit "Streak" label, no iconography. */
@Composable
fun StreakIndicator(
    item: StreakItem,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current

    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(dimens.controlCornerRadius),
        color = MaterialTheme.colorScheme.secondaryContainer,
    ) {
        Row(
            modifier = Modifier.padding(
                horizontal = dimens.itemSpacing,
                vertical = dimens.tightSpacing,
            ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(dimens.tightSpacing),
        ) {
            Text(
                text = item.count.toString(),
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = stringResource(R.string.streak_label),
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                style = MaterialTheme.typography.labelSmall,
            )
        }
    }
}
