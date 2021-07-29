package com.example.myapplication.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.model.Recipe

@Composable
fun RecipeCard(recipe: Recipe) {
    val image = painterResource(recipe.imageResource)

    Surface(
        color = Color.White,
        modifier = Modifier.clip(RoundedCornerShape(16.dp))
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp)
        ) {

            Image(
                painter = image,
                contentDescription = "This is a food image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            )

            Text(
                recipe.title,
                modifier = Modifier.fillMaxWidth(),
                style = MaterialTheme.typography.h6,
                textAlign = TextAlign.Center
            )

            recipe.ingredients.forEach { ingredient ->
                Text(text = "• $ingredient", fontSize = 14.sp)
            }
        }
    }

}

@Composable
@Preview
fun DefaultRecipeCard() {
    RecipeCard(
        Recipe(
            R.drawable.bigmac,
            "Big Mac",
            listOf(
                "2 Hamburgueres",
                "Alface",
                "Queijo",
                "Molho especial",
                "Cebola",
                "Picles",
                "Pão com gergelim"
            )
        )
    )
}

