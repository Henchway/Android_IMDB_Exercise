package com.example.imdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.imdb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val movie: Movie = Movie(
        title = "The Queen's Gambit",
        description = "The Queen's Gambit is a 2020 American coming-of-age period drama miniseries based on Walter Tevis's 1983 novel of the same name. " +
                "The title refers to \\\"Queen's Gambit\\\", a chess opening. It was written and directed by Scott Frank, who created it with Allan Scott. " +
                "Beginning in the mid-1950s and proceeding into the 1960s, the story follows the life of Beth Harmon (Anya Taylor-Joy), an orphaned " +
                "chess prodigy on her rise to the top of the chess world while struggling with drug and alcohol dependency.  Netflix released The Queen's " +
                "Gambit on October 23, 2020. After four weeks it had become Netflix's most-watched scripted miniseries.[1] It was acclaimed by critics, " +
                "who lauded Taylor-Joy's performance as well as the cinematography and production values. It has also received a positive response from the " +
                "chess community, and data suggests that it has increased public interest in the game.[2][3]  The series won two Golden Globe Awards: Best " +
                "Limited Series or Television Film and Best Actress – Miniseries or Television Film for Taylor-Joy. She was also nominated for the Critics' " +
                "Choice Television Award for Best Actress in a Movie/Miniseries and the Screen Actors Guild Award for Outstanding Performance by a Female Actor in a Miniseries or Television Movie.\n",
        rating = 4.0f,
        genres = "drama",
        creators = "Scott Frank, Alan Scott",
        actors = "Anya Taylor-Joy, Chloe Pirrie"
    )

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.movie = movie

        binding.floatingButton.setOnClickListener {
            sendToast()
        }

    }

    private fun sendToast() {
        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()
    }

}