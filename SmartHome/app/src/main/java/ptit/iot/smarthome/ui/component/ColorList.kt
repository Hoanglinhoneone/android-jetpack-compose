package ptit.iot.smarthome.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme
import ptit.iot.smarthome.data.DataSource
import ptit.iot.smarthome.utils.model.Color

@Composable
fun ColorList(
    listColor: List<Color> = DataSource.colorList
) {
    LazyRow(
        modifier = Modifier.padding(5.dp)
    ) {
        items(listColor.size) {
            ColorItem(color = listColor[it])
        }
    }
}

@Composable
fun ColorItem(
    color: Color,
    modifier: Modifier = Modifier
) {
    val colorValue = when (color) {
        Color.YELLOW -> androidx.compose.ui.graphics.Color.Yellow
        Color.RED -> androidx.compose.ui.graphics.Color.Red
        Color.BLUE -> androidx.compose.ui.graphics.Color.Blue
    }
    Column(
        modifier = modifier
            .padding(5.dp)
    ) {
        Box(
            modifier = modifier
                .clip(CircleShape)
                .size(30.dp)
                .background(color = colorValue)
                .shadow(10.dp, CircleShape)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(color.title),
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.titleSmall,
            modifier = Modifier.padding(top = 5.dp)
                .align(Alignment.CenterHorizontally)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun ColorListPreview() {
    AppTheme {
        ColorList()
    }
}

