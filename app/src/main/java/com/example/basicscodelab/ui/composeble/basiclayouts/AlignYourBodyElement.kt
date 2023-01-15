package com.example.basicscodelab.ui.composeble.basiclayouts

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basicscodelab.R
import com.example.basicscodelab.ui.theme.BasicsCodelabTheme

@Composable
fun AlignYourBodyElement(
    @StringRes title: Int,
    @DrawableRes image: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(title),
            modifier = Modifier.paddingFromBaseline(
                top = 24.dp, bottom = 8.dp
            ),
            style = MaterialTheme.typography.titleMedium,
        )
    }
}

@Preview(
    showBackground = true,

//    uiMode = UI_MODE_NIGHT_YES,
//    name = "Dark"
)
@Composable
fun AlignYourBodyElementPreview() {
    BasicsCodelabTheme {
        AlignYourBodyElement(
            title = R.string.ab1_inversions,
            image = R.drawable.ab1_inversions,
            modifier = Modifier.padding(8.dp)
        )
    }
}