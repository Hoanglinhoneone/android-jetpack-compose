package ptit.iot.smarthome.data.repository

import ptit.iot.smarthome.data.database.dao.HistoryDao
import ptit.iot.smarthome.data.database.entity.HistoryEntity

class HistoryRepositoryImp(private val historyDao: HistoryDao) : HistoryRepository {
    override suspend fun getHistory(): List<HistoryEntity> {
        return historyDao.getHistory()
    }

    override fun insertHistory(history: HistoryEntity) {
        historyDao.insertHistory(history)
    }
}