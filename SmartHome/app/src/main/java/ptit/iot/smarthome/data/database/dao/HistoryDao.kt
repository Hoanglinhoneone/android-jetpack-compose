package ptit.iot.smarthome.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ptit.iot.smarthome.data.database.entity.HistoryEntity

@Dao
interface HistoryDao {
    @Query("SELECT * FROM historyentity")
    fun getHistory(): List<HistoryEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertHistory(history: HistoryEntity)
}