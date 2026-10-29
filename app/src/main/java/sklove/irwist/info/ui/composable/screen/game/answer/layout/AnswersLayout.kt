package sklove.irwist.info.ui.composable.screen.game.answer.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import sklove.irwist.info.ui.composable.screen.game.answer.AnswerButtonItem
import sklove.irwist.info.ui.composable.screen.game.answer.button.AnswerButton
import sklove.irwist.info.ui.theme.LocalDimens

/** One answer per row, full width — simplest and most predictable for longer answer text. */
@Composable
fun AnswersLayout(
    items: List<AnswerButtonItem>,
    onAnswerClick: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    val dimens = LocalDimens.current

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(dimens.itemSpacing),
    ) {
        items.forEachIndexed { index, item ->
            AnswerButton(
                item = item,
                onClick = { onAnswerClick(index) },
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}
