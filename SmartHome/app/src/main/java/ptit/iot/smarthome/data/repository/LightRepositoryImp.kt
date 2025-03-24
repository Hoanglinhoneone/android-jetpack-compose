package ptit.iot.smarthome.data.repository

import ptit.iot.smarthome.data.database.dao.LightDao
import ptit.iot.smarthome.data.database.entity.LightEntity

class LightRepositoryImp(private val lightDao: LightDao) : LightRepository {
    override suspend fun getLights(): List<LightEntity> {
        return lightDao.getLights()
    }

    override suspend fun insertLight(light: LightEntity) {
        lightDao.insertLight(light)
    }
}