package sklove.irwist.info

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import sklove.irwist.info.ui.composable.approot.AppRoot
import sklove.irwist.info.ui.theme.SORTOAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SORTOAppTheme {
                AppRoot()
            }
        }
    }
}