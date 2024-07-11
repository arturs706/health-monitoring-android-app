package uk.co.aipainapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    buttonText: String,
    buttonColor: Color,
    textColor: Color = Color.White,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 18.dp, end = 70.dp)
            .border(width = 4.dp, color = buttonColor, shape = RoundedCornerShape(5.dp))
            .background(buttonColor),
        colors = ButtonDefaults.buttonColors(buttonColor)
    ) {
        Text(
            text = buttonText,
            color = textColor,
        )
    }
}
