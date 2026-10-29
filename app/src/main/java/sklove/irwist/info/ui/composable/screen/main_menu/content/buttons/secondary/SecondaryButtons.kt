package sklove.irwist.info.ui.composable.screen.main_menu.content.buttons.secondary

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import sklove.irwist.info.ui.composable.screen.shared.button.ActionButtonItem
import sklove.irwist.info.ui.composable.screen.shared.button.ActionButton
import sklove.irwist.info.ui.theme.LocalDimens

@Composable
fun SecondaryButtons(
    highScoresItem: ActionButtonItem,
    aboutItem: ActionButtonItem,
    onHighScoresClick: () -> Unit,
    onAboutClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(dimens.itemSpacing),
    ) {
        ActionButton(item = highScoresItem, onClick = onHighScoresClick)
        ActionButton(item = aboutItem, onClick = onAboutClick)
    }
}
