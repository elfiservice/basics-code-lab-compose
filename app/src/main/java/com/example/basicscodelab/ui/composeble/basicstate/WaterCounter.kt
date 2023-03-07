package com.example.basicscodelab.ui.composeble.basicstate

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        // val count: MutableState<Int> = remember { mutableStateOf(0) }
        // count.value to access

        // using https://kotlinlang.org/docs/delegated-properties.html
        var count by remember { mutableStateOf(0) }

        Text("You've had ${count} glasses.")
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp)) {
            Text("Add one")
        }
    }
}