package com.example.lab1_2

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun StyledText(textToDisplay: String) {
    Text(
        text = textToDisplay,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp,
        textAlign = TextAlign.Center
    )
}