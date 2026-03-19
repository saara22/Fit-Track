package com.example.fittrack.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.fittrack.model.CardItem
import com.example.fittrack.ui.components.ExpandableCard

@Composable
fun HomeScreen() {

    val items = listOf(
        CardItem(
            title = "Workout Plan",
            description = "Daily exercise routine",
            details = listOf("Monday: Chest", "Tuesday: Back", "Wednesday: Legs")
        ),
        CardItem(
            title = "Diet Plan",
            description = "Healthy meal suggestions",
            details = listOf("Breakfast: Oats", "Lunch: Chicken Salad", "Dinner: Fish")
        ),
        CardItem(
            title = "Progress Tracker",
            description = "Track your fitness journey",
            details = listOf("Weight: 75kg", "Body Fat: 15%", "Steps: 10,000")
        )
    )

    LazyColumn {
        items(items) { item ->
            ExpandableCard(item)
        }
    }
}
