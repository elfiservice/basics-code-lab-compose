package com.example.basicscodelab.ui.composeble.basicstate.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
/*

https://developer.android.com/codelabs/jetpack-compose-state?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fjetpack-compose-for-android-developers-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fjetpack-compose-state#11
item 6
about the mutableState to checked attr
 */
class WellnessTask(
    val id: Int,
    val label: String,
    initialChecked: Boolean = false
) {
    /*
    Make WellnessTask receive an initialChecked variable with default value false
    in the constructor, then we can initialize the checked variable with the factory
    method mutableStateOf and taking initialChecked as default value.
     */
    var checked by mutableStateOf(initialChecked)
}