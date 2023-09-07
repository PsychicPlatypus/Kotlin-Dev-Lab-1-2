package com.example.lab1_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
        if (toggled) {
            Column(
                modifier = Modifier
                    .verticalScroll(
                        state = scrollState,
                        enabled = true,
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                Row {
                    StyledText(
                        textToDisplay = recipe.name,
                        textStyle = MaterialTheme.typography.headlineMedium,
                        textColor = Color.Black
                    )
                }
                for (section in recipe.sections) {
                    // Every section has a image and a body
                    Row(
                        modifier = Modifier.padding(bottom = 10.dp)
                    ) {
                        Column {
                            if (section.image != null) {
                                Row(
                                    modifier = Modifier
                                        .padding(bottom = 10.dp)
                                        .align(Alignment.CenterHorizontally)
                                )
                                {
                                    Image(
                                        painter = painterResource(id = section.image.imageId),
                                        contentDescription = section.image.text,
                                    )
                                }
                            }
                            Row {
                                StyledText(
                                    textToDisplay = section.text,
                                    textStyle = MaterialTheme.typography.bodyMedium,
                                    textColor = Color.DarkGray
                                )
                            }
                        }
                    }
                }
            }
        } else {
            StyledText(
                textToDisplay = "Click Toggle View To See The Recipe!",
                textStyle = MaterialTheme.typography.bodyMedium,
                textColor = Color.DarkGray
            )
        }
    }
}
