package sklove.irwist.info.di

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import sklove.irwist.info.ui.viewmodel.GameViewModel
import sklove.irwist.info.ui.viewmodel.HighScoreViewModel
import sklove.irwist.info.ui.viewmodel.TopicsSelectionViewModel

val viewModule = module {
    viewModel {
        TopicsSelectionViewModel(topicRepository = get())
    }

    viewModel {
        GameViewModel(
            savedStateHandle = get(),
            topicRepository = get(),
            highScoreRepository = get()
        )
    }

    viewModel {
        HighScoreViewModel(
            highScoreRepository = get()
        )
    }
}