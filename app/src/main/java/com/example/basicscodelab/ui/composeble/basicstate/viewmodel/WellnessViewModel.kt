package com.example.basicscodelab.ui.composeble.basicstate.viewmodel

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.basicscodelab.ui.composeble.basicstate.data.getFakeWellnessTasks
import com.example.basicscodelab.ui.composeble.basicstate.model.WellnessTask

class WellnessViewModel : ViewModel() {
    private val _tasks = getFakeWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks


    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }
}