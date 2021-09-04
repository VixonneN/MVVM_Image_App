package com.vixonnen.myapplication.screens.models

data class RequestPages(
    val total: Int = 0,
    val total_pages: Int = 0,
    val resutls: List<Results>
) {
}