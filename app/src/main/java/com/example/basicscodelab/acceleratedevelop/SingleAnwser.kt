package com.example.basicscodelab.acceleratedevelop

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.basicscodelab.R

// type: comp -> create a func composable
@Composable
fun SingleAnwser() {
    //type WR -> create Row { }
    Row {
        //yellow Lamp and surround with Row
        Row {
            // click in the image icon left in the same line of the Image composable to navigate in the images with thmbnails
            Image(painterResource(id = R.drawable.ab3_stretching), contentDescription = "")
            // click in the Color Picker icon on left in the same line of the Text with color propt composable change the color
            Text(text = "TEST", color = Color(0xFFB12222))
            RadioButton(selected = false, onClick = { /*TODO*/ })
        }
    }

}