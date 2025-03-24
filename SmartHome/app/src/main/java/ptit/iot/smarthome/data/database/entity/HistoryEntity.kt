package ptit.iot.smarthome.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class HistoryEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "time") val date: String,
    @ColumnInfo(name = "action") val light: String,
    @ColumnInfo(name = "state") val state: String
)