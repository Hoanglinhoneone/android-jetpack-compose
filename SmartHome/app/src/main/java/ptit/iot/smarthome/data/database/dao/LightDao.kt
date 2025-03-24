package ptit.iot.smarthome.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ptit.iot.smarthome.data.database.entity.LightEntity

@Dao
interface LightDao {
    @Query("SELECT * FROM lightentity")
    fun getLights(): List<LightEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLight(light: LightEntity)
}