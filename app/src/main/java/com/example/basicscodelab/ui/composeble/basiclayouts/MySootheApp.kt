package com.example.basicscodelab.ui.composeble.basiclayouts

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.basicscodelab.ui.theme.BasicsCodelabTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySootheApp() {
    BasicsCodelabTheme{
        Scaffold(
            bottomBar = { SootheBottomNavigation() }
        ) { padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}