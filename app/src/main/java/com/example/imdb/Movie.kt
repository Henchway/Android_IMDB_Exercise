package com.example.imdb

// Currently configured as immutable (val)

data class Movie(
    val title: String="",
    val description: String="",
    val rating: Float=0.0f,
    val genres: String?,
    val creators: String="",
    val actors: String=""
)