package pe.edu.ulima.smartretailai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import pe.edu.ulima.smartretailai.navigation.AppNavigation
import pe.edu.ulima.smartretailai.ui.theme.SmartRetailAITheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            SmartRetailAITheme {

                AppNavigation()

            }

        }
    }
}