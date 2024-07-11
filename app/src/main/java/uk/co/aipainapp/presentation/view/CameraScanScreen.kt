package uk.co.aipainapp.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import uk.co.aipainapp.R
import uk.co.aipainapp.presentation.components.CustomButton
import uk.co.aipainapp.presentation.components.NavComponent.Companion.Nav
import uk.co.aipainapp.presentation.components.SearcgBarComponent
import uk.co.aipainapp.presentation.components.TopBarComponent
import uk.co.aipainapp.presentation.view.theme.WhiteCustom
import uk.co.aipainapp.presentation.view.theme.Salmon

@Composable
fun CameraScanScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = WhiteCustom),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopBarComponent.TopBar()
        SearcgBarComponent.SearchBar()

        Spacer(modifier = Modifier.weight(1f))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.face),
                contentDescription = "Facial"
            )
            CustomButton(
                buttonText = "Login",
                buttonColor = Salmon,
                onClick = {
                    // Your login logic
                },

            )
            CustomButton(
                buttonText = "Sign Up",
                buttonColor = Salmon,
                onClick = {
                    // Your sign-up logic
                },

            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Nav(navController = navController)
    }
}

@Preview
@Composable
fun CameraComposablePreview() {
    val navController = rememberNavController()
    CameraScanScreen(navController)
}
