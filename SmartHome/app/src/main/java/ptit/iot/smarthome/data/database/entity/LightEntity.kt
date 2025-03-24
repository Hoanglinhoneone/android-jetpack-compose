package ptit.iot.smarthome.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LightEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "time") val time: String,
    @ColumnInfo(name = "light") val light: Float,
)
