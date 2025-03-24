package ptit.iot.smarthome.ui.screen.stats

import androidx.lifecycle.ViewModel
import ptit.iot.smarthome.data.repository.HistoryRepository
import ptit.iot.smarthome.data.repository.LightRepository

class StatsViewModel(
    private val lightRepository: LightRepository,
    private val historyRepository: HistoryRepository
) : ViewModel() {

//    fun getLightHistory() = lightRepository.getLights()

}