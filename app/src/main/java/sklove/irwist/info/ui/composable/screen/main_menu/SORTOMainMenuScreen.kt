package sklove.irwist.info.ui.composable.screen.main_menu

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import sklove.irwist.info.ui.composable.screen.main_menu.content.MainMenuContent

@Composable
fun SORTOMainMenuScreen(
    modifier: Modifier = Modifier,
    onTopicsSelectionScreenNavigation: (isMultiplayer: Boolean) -> Unit,
    onHighScoresScreenNavigation: () -> Unit,
    onAboutScreenNavigation: () -> Unit,
    onExit: () -> Unit,
) {
    MainMenuContent(
        modifier = modifier,
        onTopicsSelectionScreenNavigation = onTopicsSelectionScreenNavigation,
        onHighScoresScreenNavigation = onHighScoresScreenNavigation,
        onAboutScreenNavigation = onAboutScreenNavigation,
        onExit = onExit,
    )
}
