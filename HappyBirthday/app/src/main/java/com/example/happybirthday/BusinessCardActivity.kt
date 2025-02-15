package com.example.happybirthday

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class BusinessCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    HappyBirthdayTheme {
        BusinessCard(
            stringResource(R.string.fullName), stringResource(R.string.title),
            stringResource(R.string.phone), stringResource(R.string.social),
            stringResource(R.string.email)
        )
    }
}

@Composable
fun BusinessCard(fullName : String, title: String, phone: String, social: String, email: String,
                 modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
            .padding(16.dp)

    ) {
        ContentContact(fullName, title)
        ContentInfo(
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun ContentContact(fullName : String, title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AndroidLogoBackground()
        Text(
            text = fullName,
        )
        Text(
            text = title
        )
    }

}

@Preview
@Composable
fun ContentInfo(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Bottom
    ) {
        ItemInfo(painterResource(R.drawable.ic_phone), stringResource(R.string.phone))
        ItemInfo(painterResource(R.drawable.icon_tag), stringResource(R.string.social))
        ItemInfo(painterResource(R.drawable.ic_mail), stringResource(R.string.email))
    }
}
@Composable
fun AndroidLogoBackground() {
    Box(
        modifier = Modifier
            .size(100.dp, 100.dp)
            .background(Color.Black), // Màu nền đen
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo), // Thay bằng logo của bạn
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp)
        )
    }
}

@Composable
fun ItemInfo(image : Painter, content : String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.padding(end = 16.dp)
        )
        Text(
            text = content,
        )
    }
}

@Preview
@Composable
fun PreviewAndroidLogoBackground() {
    AndroidLogoBackground()
}
