package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kmp.composeapp.generated.resources.Res
import kmp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {


        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.SpaceBetween
        ) {


            Text(text = "Cricket", fontSize = 30.sp)
            Column() {
                Box(
                    Modifier.height(100.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .background(color = Color.Yellow)
                            .fillMaxWidth(1f),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(text = "Team")
                            Text(text = "Sumit")

                        }
                        Button(onClick = {}) {
                            Text(text = "6")
                        }
                        Button(onClick = {}) {
                            Text(text = "4")
                        }
                        Button(onClick = {}) {
                            Text(text = "2")
                        }
                        Button(onClick = {}) {
                            Text(text = "1")
                        }
                        Column {
                            Text(text = "Score")
                            Text(text = "0")
                        }
                    }

                }
                Box(
                    Modifier.height(100.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .background(color = Color.Green)
                            .fillMaxWidth(1f),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(text = "Team")
                            Text(text = "Aman")

                        }
                        Button(onClick = {}) {
                            Text(text = "6")
                        }
                        Button(onClick = {}) {
                            Text(text = "4")
                        }
                        Button(onClick = {}) {
                            Text(text = "2")
                        }
                        Button(onClick = {}) {
                            Text(text = "1")
                        }
                        Column {
                            Text(text = "Score")
                            Text(text = "0")
                        }
                    }
                }
            }

        }

    }
}