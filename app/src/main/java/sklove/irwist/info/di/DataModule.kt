package sklove.irwist.info.di

import androidx.room.Room
import sklove.irwist.info.data.database.SORTODatabase
import org.koin.dsl.module
import sklove.irwist.info.data.repository.HighScoreRepository
import sklove.irwist.info.data.repository.TopicRepository

private const val DB_NAME = "sorto_quiz_db"

val dataModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = SORTODatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<SORTODatabase>().highScoreDao() }

    single {
        HighScoreRepository(
            highScoreDao = get(),
            coroutineDispatcher = get(DispatchersQualifiers.IO)
        )
    }

    single { TopicRepository() }
}