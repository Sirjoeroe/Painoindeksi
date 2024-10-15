package com.example.bmiviewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class BMIViewModel : ViewModel() {
    var height by mutableStateOf("")
        private set

    var weight by mutableStateOf("")
        private set

    fun updateHeight(newHeight: String) {
        height = newHeight
    }

    fun updateWeight(newWeight: String) {
        weight = newWeight
    }

    fun getBMIResult(): Float {
        val h = height.toFloatOrNull() ?: return 0f
        val w = weight.toFloatOrNull() ?: return 0f
        return if (h > 0) w / (h * h) else 0f
    }
}
