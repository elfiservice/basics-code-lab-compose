package com.example.basicscodelab.ui.composeble.basiclayouts

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Spa
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.basicscodelab.R
import com.example.basicscodelab.ui.theme.BasicsCodelabTheme

@Composable
fun SootheBottomNavigation(modifier: Modifier = Modifier) {

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.background,
        modifier = modifier
    ) {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Spa, contentDescription = null) },
            label = {
                Text(stringResource(R.string.bottom_navigation_home))
            },
            selected = true,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null
                )
            },
            label = {
                Text(stringResource(R.string.bottom_navigation_profile))
            },
            selected = false,
            onClick = {}
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun SootheBottomNavigationPreview() {
    BasicsCodelabTheme { SootheBottomNavigation() }
}