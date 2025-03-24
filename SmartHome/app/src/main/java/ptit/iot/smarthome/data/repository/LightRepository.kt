package ptit.iot.smarthome.data.repository

import ptit.iot.smarthome.data.database.dao.LightDao
import ptit.iot.smarthome.data.database.entity.LightEntity

interface LightRepository {
    suspend fun getLights(): List<LightEntity>
    suspend fun insertLight(light: LightEntity)
}