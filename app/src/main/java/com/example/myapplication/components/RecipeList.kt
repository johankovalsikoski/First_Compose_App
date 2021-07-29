package com.example.myapplication.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.model.Recipe

@Composable
fun RecipeList(recipes: List<Recipe>) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(recipes) { recipe ->
            RecipeCard(recipe = recipe)
        }
    }
}

@Composable
@Preview
fun DefaultRecipeList() {
    RecipeList(recipes = listOf(
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
        ),

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
        ),

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
    ))
}