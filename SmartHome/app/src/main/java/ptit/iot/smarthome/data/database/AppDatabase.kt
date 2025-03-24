package ptit.iot.smarthome.data.database

import androidx.room.Database
import ptit.iot.smarthome.data.database.dao.HistoryDao
import ptit.iot.smarthome.data.database.dao.LightDao
import ptit.iot.smarthome.data.database.entity.HistoryEntity
import ptit.iot.smarthome.data.database.entity.LightEntity

@Database(entities = [LightEntity::class, HistoryEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase {
    abstract fun lightDao(): LightDao
    abstract fun historyDao(): HistoryDao
}