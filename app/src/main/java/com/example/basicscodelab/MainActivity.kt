package com.example.basicscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basicscodelab.ui.composeble.MyApp
import com.example.basicscodelab.ui.composeble.basiclayouts.*
import com.example.basicscodelab.ui.theme.BasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySootheApp()
        }
    }
}


@Preview(
    showBackground = true,
    widthDp = 320,
//    uiMode = UI_MODE_NIGHT_YES,
//    name = "Dark"
)
@Composable
fun DefaultPreview() {
    BasicsCodelabTheme {
        SearchBar()
    }
}