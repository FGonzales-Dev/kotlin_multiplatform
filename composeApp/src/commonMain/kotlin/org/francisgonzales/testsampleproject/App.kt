package org.francisgonzales.testsampleproject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        var number1 by remember { mutableStateOf("") }
        var number2 by remember { mutableStateOf("") }
        var result by remember { mutableStateOf(0) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = number1,
                onValueChange = { number1 = it },
                label = { Text("Enter first number") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            TextField(
                value = number2,
                onValueChange = { number2 = it },
                label = { Text("Enter second number") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    val num1 = number1.toIntOrNull() ?: 0
                    val num2 = number2.toIntOrNull() ?: 0
                    result = num1 + num2
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Calculate Sum")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Result: $result"
            )
        }
    }
}