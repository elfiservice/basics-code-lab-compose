package com.example.basicscodelab.ui.composeble.basicstate.data

import com.example.basicscodelab.ui.composeble.basicstate.model.WellnessTask

fun getFakeWellnessTasks() = List(30) { i -> WellnessTask(id = i, label = "Task # $i") }