package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                ArtSpaceApp()
            }
        }
    }
}

@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        ImageBlock(R.drawable.img_1)
        ArtworkInfo(stringResource(R.string.art_one), stringResource(R.string.artist_one))
        NavigationBlock()
    }
}

@Composable
fun NavigationBlock(modifier: Modifier = Modifier) {
    Row(
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(8.dp)
                .weight(1f)
        ) { Text(text = "Previous") }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(8.dp)
                .weight(1f)
        ) { Text(text = "Next") }
    }
}

@Composable
fun ArtworkInfo(title: String, artist: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
            .background(Color(0xFF00837C))

    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            modifier = modifier.padding(8.dp)
        )
        Text(
            text = artist,
            style = MaterialTheme.typography.titleMedium,
            modifier = modifier.padding(8.dp)
        )
    }
}

@Composable
fun ImageBlock(image: Int) {
    Box(
        modifier = Modifier
            .padding(16.dp) // Thêm padding để tạo không gian xung quanh
            .background(Color.White)
            .clip(RoundedCornerShape(12.dp)) // Góc bo tròn
            .shadow(8.dp, RoundedCornerShape(12.dp), clip = false) // Hiệu ứng bóng mềm mại hơn
            .border(1.dp, Color.Gray, RoundedCornerShape(12.dp)) // Thêm đường viền xung quanh
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth() // Chiều rộng ảnh đầy đủ trong Box
                .clip(RoundedCornerShape(12.dp)) // Góc bo tròn cho ảnh
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}