package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                LemonTree()
            }
        }
    }
}

@Composable
fun LemonTree(modifier: Modifier = Modifier) {
    var cursor by remember { mutableIntStateOf(0) }
    val imageResource = when
                                (cursor) {
        0 -> R.drawable.lemon_tree
        1 -> R.drawable.lemon_squeeze
        2 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }
    val contentDescription = when (cursor) {
        0 -> R.string.description_one
        1 -> R.string.description_two
        2 -> R.string.description_three
        else -> R.string.description_four
    }
    val text = when (cursor) {
        0 -> R.string.notify_one
        1 -> R.string.notify_two
        2 -> R.string.notify_three
        else -> R.string.notify_four
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ClickableImage(imageResource, contentDescription) {
//            if(cursor == 1) cursor = (1..2).random()
//            else if (cursor > 3 ) cursor = 0
//            else cursor++
            when (cursor) {
                1 -> cursor = (1..2).random()
                4 -> cursor = 0
                else -> cursor++
            }
        }
        Text(
            text = stringResource(text),
            fontSize = 18.sp,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LemonadeTheme {
        LemonTree(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        )
    }
}

@Composable
fun ClickableImage(image: Int, description: Int, onClick: () -> Unit) {
    Image(
        painter = painterResource(image),
        contentDescription = stringResource(description),
        modifier = Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(50.dp))
            .background(
                color = androidx.compose.ui.graphics.Color(0xFFC3ECD2)
            )
            .padding(32.dp)
            .clickable { onClick() }
    )
}