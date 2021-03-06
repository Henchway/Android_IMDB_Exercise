package com.example.imdb

import android.widget.RatingBar
import android.widget.TextView
import androidx.databinding.BindingAdapter


@BindingAdapter("android:text")
fun setText(view: TextView, list: List<String>) {
    view.text = list.joinToString(", ")
}

@BindingAdapter("android:rating")
fun setRating(ratingBar: RatingBar, float: Float) {
    when (float) {
        in (0.0f..5.0f) -> ratingBar.rating = float
        else -> ratingBar.rating = 0.0f
    }
}

// Currently configured as immutable (val)

data class Movie(
    val title: String = "",
    val description: String = "",
    val rating: Float = 0.0f,
    val genres: List<String>? = null,
    val creators: List<String> = emptyList(),
    val actors: List<String> = emptyList()

)



