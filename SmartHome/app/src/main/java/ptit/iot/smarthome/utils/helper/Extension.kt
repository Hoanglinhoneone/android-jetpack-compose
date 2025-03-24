package ptit.iot.smarthome.utils.helper

fun handleVoice(voice: String): String {
    val array: List<String> = voice.split(" ")
    return array.firstOrNull { it.lowercase() == "bật" || it.lowercase() == "tắt" } ?: "nothing"
}