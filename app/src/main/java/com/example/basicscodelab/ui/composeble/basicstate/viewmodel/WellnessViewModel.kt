package com.example.basicscodelab.ui.composeble.basicstate.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.basicscodelab.ui.composeble.basicstate.data.getFakeWellnessTasks
import com.example.basicscodelab.ui.composeble.basicstate.model.WellnessTask

class WellnessViewModel : ViewModel() {
    private val _tasks = getFakeWellnessTasks().toMutableStateList()
    private var _waterCounter: Int by mutableStateOf(0)

    val tasks: List<WellnessTask>
        get() = _tasks

    val waterCount: Int
        get() = _waterCounter

    fun incresWaterCount() {
        _waterCounter++
    }

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) =
        tasks.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }
}
