package com.example.lab1_2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Main() {

    var toggleView by remember { mutableStateOf(false) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        RecipeBox(recipe = cakeRecipe, toggled = toggleView)
        Button(
            onClick = { toggleView = !toggleView },
            Modifier.width(300.dp),
        ) {
            StyledText(
                textToDisplay = "Toggle View",
                textColor = Color.White,
                textStyle = MaterialTheme.typography.bodyMedium
            )
        }
    }
}