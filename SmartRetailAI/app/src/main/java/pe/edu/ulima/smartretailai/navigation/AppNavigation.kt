package pe.edu.ulima.smartretailai.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.ulima.smartretailai.ui.theme.screens.CameraScreen
import pe.edu.ulima.smartretailai.ui.theme.screens.HomeScreen
import pe.edu.ulima.smartretailai.ui.theme.screens.ResultScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable("home") {

            HomeScreen(
                onScanClick = {
                    navController.navigate("camera")
                }
            )

        }

        composable("camera") {

            CameraScreen(
                onPhotoTaken = {
                    navController.navigate("result")
                }
            )

        }

        composable("result") {

            ResultScreen(
                onBackHome = {
                    navController.popBackStack("home", false)
                }
            )

        }

    }

}