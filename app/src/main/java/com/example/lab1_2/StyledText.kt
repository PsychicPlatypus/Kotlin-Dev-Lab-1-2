package com.example.lab1_2

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun StyledText(textToDisplay: String, textStyle: TextStyle, textColor: Color) {
    Text(
        text = textToDisplay,
        color = textColor,
        style = textStyle,
        fontWeight = FontWeight.W600,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(bottom = 10.dp)
    )
}