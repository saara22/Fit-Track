package com.example.fittrack.model

data class CardItem(
    val title: String,
    val description: String,
    val details: List<String> = emptyList(),
    var isFavourite: Boolean = false
)

