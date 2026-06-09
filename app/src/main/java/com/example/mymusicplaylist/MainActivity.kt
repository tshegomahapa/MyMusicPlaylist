package com.example.mymusicplaylist

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mymusicplaylist.ui.theme.MyMusicPlaylistTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyMusicPlaylistTheme {
                Column() {
                    Text("Greetings,Welcome to the Music App")
                    Button(
                        onClick = {
                            val intent = Intent(this@MainActivity, AddToPlaylist::class.java)
                            startActivity(intent)
                        }
                    ) {
                        Text("Add to playlist")
                    }
                    Button(
                        onClick = {
                            val intent = Intent(this@MainActivity, DetailedView::class.java)
                            startActivity(intent)
                        }
                    ) {
                        Text("Detailed View")
                    }
                    Button(
                        onClick = {
                            finishAffinity()
                        }
                    ) {
                        Text("Exit")
                    }

                }
            }
        }
    }
}

