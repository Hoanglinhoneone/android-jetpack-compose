package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class ShareScreenActivity : ComponentActivity() {
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
fun ShareScreenPreview() {
    HappyBirthdayTheme {
        ShareScreen(
            stringResource(R.string.title1), stringResource(R.string.content1),
            stringResource(R.string.title2), stringResource(R.string.content2),
            stringResource(R.string.title3), stringResource(R.string.content3),
            stringResource(R.string.title4), stringResource(R.string.content4)
        )
    }
}

@Composable
fun ShareScreen(
    title1: String, content1: String,
    title2: String, content2: String,
    title3: String, content3: String,
    title4: String, content4: String,
    modifier: Modifier = Modifier
) {
    Column(modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            ContentOfBlock(title1, content1, 0xFFEADDFF, modifier = Modifier.weight(1f))
            ContentOfBlock(title2, content2, 0xFFD0BCFF, modifier = Modifier.weight(1f))
        }
        Row(modifier = Modifier.weight(1f)) {
            ContentOfBlock(title3, content3, 0xFFB69DF8, modifier = Modifier.weight(1f))
            ContentOfBlock(title4, content4, 0xFFF6EDFF, modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun ContentOfBlock(title: String, content: String, color: Long, modifier: Modifier = Modifier) {
    val colorValue = Color(color)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(colorValue)
            .padding(start = 16.dp, end = 16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
        )
    }
}




