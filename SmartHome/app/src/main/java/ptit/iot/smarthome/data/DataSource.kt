package ptit.iot.smarthome.data

import ptit.iot.smarthome.R
import ptit.iot.smarthome.utils.model.Color

object DataSource {
    val colorList: List<Color> = listOf(
        Color.YELLOW,
        Color.RED,
        Color.BLUE
    )
}

enum class HistoryAction(val title: Int) {
    LIGHT_ON(R.string.light_on_action),
    LIGHT_OFF(R.string.light_off_action),
    AUTO_ON(R.string.auto_on_action),
    AUTO_OFF(R.string.auto_off_action)
}

enum class ActionState(val title: Int) {
    SUCCESS(R.string.success),
    FAIL(R.string.fail)
}