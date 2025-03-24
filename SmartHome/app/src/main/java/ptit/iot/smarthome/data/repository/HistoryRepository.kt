package ptit.iot.smarthome.data.repository

import ptit.iot.smarthome.data.database.entity.HistoryEntity

interface HistoryRepository {
    suspend fun getHistory(): List<HistoryEntity>
    fun insertHistory(history: HistoryEntity)
}