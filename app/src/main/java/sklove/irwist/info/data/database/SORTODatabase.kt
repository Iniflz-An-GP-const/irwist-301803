package sklove.irwist.info.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import sklove.irwist.info.data.database.dao.HighScoreDao
import sklove.irwist.info.data.database.converter.Converters
import sklove.irwist.info.data.entity.HighScore

@Database(
    entities = [HighScore::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class SORTODatabase : RoomDatabase() {

    abstract fun highScoreDao(): HighScoreDao
}

