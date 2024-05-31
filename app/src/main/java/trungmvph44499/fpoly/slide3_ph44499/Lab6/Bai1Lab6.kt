package trungmvph44499.fpoly.slide3_ph44499.Lab6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import trungmvph44499.fpoly.slide3_ph44499.R

class Bai1Lab6 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MovieScreen(MovieModel.getSampleMovies())
        }
    }
}
data class MovieModel(
    var title: String,
    var year: String,
    var posterUrl: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            MovieModel("LẬT MẶT 7: MỘT ĐIỀU ƯỚC","2024","https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/thumbnail/190x260/2e2b8cd282892c71872b9e67d2cb5039/l/a/lat-mat-7.jpg"),
            MovieModel("KẺ TRỘM MẶT TRĂNG","2025","https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/thumbnail/190x260/2e2b8cd282892c71872b9e67d2cb5039/d/m/dm4_posterminion_700x1000.jpg"),
            MovieModel("DORAEMON: NOBITA VÀ BẢN GIAO HƯỞNG ĐỊA CẦU","2024","https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/thumbnail/190x260/2e2b8cd282892c71872b9e67d2cb5039/d/r/drm24_-_poster.jpg"),
            MovieModel("HÀNH TINH KHỈ: VƯƠNG QUỐC MỚI","2024","https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/thumbnail/190x260/2e2b8cd282892c71872b9e67d2cb5039/f/z/fzone_007c_g_vie-vn_4x5_.jpg"),
            MovieModel("THÁNG TƯ, NGÀY EM ĐẾN","2025","https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/thumbnail/190x260/2e2b8cd282892c71872b9e67d2cb5039/4/7/470wx700h-april.jpg"),

            )
    }
}
@Composable
private fun MovieScreen(movies: List<MovieModel>) {
    LazyRow(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(movies.size) { index ->
            MovieItem(movie = movies[index])
        }
    }
}

@Composable
private fun MovieItem(movie: MovieModel) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
    ) {
        Column(
            modifier = Modifier
                .width(175.dp)
                .height(330.dp)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(movie.posterUrl)
                    .crossfade(true)
                    .build(),
                placeholder =   painterResource(id = R.drawable.ic_launcher_foreground),
                contentScale = ContentScale.Crop,
                contentDescription = null,
                modifier = Modifier
                    .height(255.dp)
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(topEnd = 8.dp, topStart = 8.dp)
                    ),
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Text(text = movie.title, style =
                MaterialTheme.typography.titleSmall, maxLines = 2)
                Text(text = "Thời lượng: ${movie.year}", style =
                MaterialTheme.typography.bodySmall)
            }
        }
    }
}






