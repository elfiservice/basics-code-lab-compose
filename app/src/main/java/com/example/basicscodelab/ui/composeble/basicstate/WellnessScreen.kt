package com.example.basicscodelab.ui.composeble.basicstate

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import com.example.basicscodelab.ui.composeble.basicstate.data.getFakeWellnessTasks

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter()
        val list = remember { getFakeWellnessTasks().toMutableStateList() }
        WellnessTasksList(modifier, list = list)
    }
}