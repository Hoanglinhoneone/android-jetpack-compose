package ptit.iot.smarthome.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.compose.AppTheme
import dagger.hilt.android.AndroidEntryPoint
import ptit.iot.smarthome.ui.component.AppNavigationDrawer

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Linh_HN", "onCreate OK")
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                AppNavigationDrawer()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}