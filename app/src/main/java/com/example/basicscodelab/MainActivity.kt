package com.example.basicscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basicscodelab.ui.composeble.MyApp
import com.example.basicscodelab.ui.theme.BasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                MyApp(modifier = Modifier.fillMaxSize())
            }
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
        MyApp(Modifier.fillMaxSize())
    }
}