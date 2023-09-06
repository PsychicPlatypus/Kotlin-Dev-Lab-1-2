package com.example.lab1_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun RecipeBox(recipe: CakeRecipe, toggled: Boolean) {
    val scrollState = rememberScrollState()

    Box(
        modifier = androidx.compose.ui.Modifier
            .padding(30.dp)
            .width(300.dp)
            .height(600.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(
                    state = scrollState,
                    enabled = true,
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            if (toggled) {
                // Title should be Larger and in a Darker color than the recipe body
                Row {
                    Text(
                        text = recipe.name,
                        style = MaterialTheme.typography.headlineMedium,
                        color = Color.Black
                    )
                }
                for (section in recipe.sections) {
                    // Every section has a image and a body
                    Row(
                        modifier = Modifier.padding(bottom = 10.dp)
                    ) {
                        Column {
                            if (section.image != null) {
                                Row {
                                    Image(
                                        painter = painterResource(id = section.image.imageId),
                                        contentDescription = section.image.text,
                                    )
                                }
                            }
                            Row {
                                Text(
                                    text = section.text,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Color.DarkGray,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}