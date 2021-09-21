package com.example.fooddeliveryapp

import androidx.annotation.DrawableRes

data class PopularData(
    @DrawableRes val resId: Int,
    val title: String,
    val price: Double,
    val rate: Double,
    val description: String,
    val calori: Double,
    val scheduleTime: Double,
    val ingradients: List<Int>
)
