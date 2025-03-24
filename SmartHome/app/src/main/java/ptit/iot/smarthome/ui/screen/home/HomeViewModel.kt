//package ptit.iot.smarthome.ui.viewmodel
//
////import ptit.iot.smarthome.utils.mqtt.MqttHelper
//import android.util.Log
//import android.widget.Toast
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.google.firebase.database.FirebaseDatabase
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//@HiltViewModel
//class HomeViewModel @Inject constructor(
//    private val database: FirebaseDatabase
//) : ViewModel() {
//
//    private fun readData() {
//        database.getReference("sensorData").child("light").get().addOnSuccessListener {
//            if (it.exists()) {
//                Log.i("Linh_HN", "light: ${it.value}")
//            } else {
//                Log.i("Linh_HN", "light: null")
//            }
//        }
//            .addOnFailureListener {
//                Log.i("Linh_HN", "light: fail")
//            }
//    }
//
//}