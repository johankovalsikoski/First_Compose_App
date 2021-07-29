package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.components.RecipeList
import com.example.myapplication.model.Recipe
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    mainFun()
                }
            }
        }

    }
}

@Composable
fun mainFun() {
    RecipeList(
        recipes =
        listOf(
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
        )
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        mainFun()
    }
}