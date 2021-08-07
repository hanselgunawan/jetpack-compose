package com.example.jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                // Modifier will be applied sequentially
                Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(5.dp, Color.Magenta, RoundedCornerShape(15.dp))
                    .padding(50.dp)
                    .border(5.dp, Color.Black)
                    .padding(10.dp)
//                    .requiredWidth(300.dp)
            ) {
                Text(text = "Hello", modifier = Modifier.clickable {
                    Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_SHORT).show()
                })
                Spacer(modifier = Modifier.height(50.dp)) // to put an extra space
                Text(text = "World")
            }
        }
    }
}