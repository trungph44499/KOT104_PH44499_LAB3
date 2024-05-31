package trungmvph44499.fpoly.slide3_ph44499.Lab6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


class Bai2Lab6 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MovieScreen(Movie.getSampleMovies())

        }
    }
}
data class Movie(
    var title: String,
    var year: String,
    var posterUrl: String,
    var duration: String,
    var releaseDate: String,
    var genre: String,
    var shotDescription: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie("LẬT MẶT 7: MỘT ĐIỀU ƯỚC","2024","https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/thumbnail/190x260/2e2b8cd282892c71872b9e67d2cb5039/l/a/lat-mat-7.jpg","180'","20/2/2024","Kinh dị", "Fujishiro Shun (Satoh Takeru) đang chuẩn bị kết hôn. Một ngày tháng Tư, Fujishiro bỗng nhận được lá thư từ Haru (Nana Mori), mối tình 10 năm trước của anh. Cùng lúc đó, vợ sắp cưới Fujishiro là Yayoi (Masami Nagasawa) đột nhiên biến mất. Fujishiro bắt đầu bước vào hành trình tìm kiếm người người vợ chưa cưới với những kỷ niệm lúc cả hai bên nhau, cùng lúc đó hồi ức tình yêu thanh xuân cũng ùa về. Bộ phim mang màu sắc lãng mạn với nhiều cảnh quay trải dài khắp Tokyo, Uyuni (Bolivia), Prague (Cộng hòa Séc), Iceland và các quốc gia khác trên thế giới."),
            Movie("KẺ TRỘM MẶT TRĂNG","2025","https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/thumbnail/190x260/2e2b8cd282892c71872b9e67d2cb5039/d/m/dm4_posterminion_700x1000.jpg","180'","20/2/2024","Kinh dị","Fujishiro Shun (Satoh Takeru) đang chuẩn bị kết hôn. Một ngày tháng Tư, Fujishiro bỗng nhận được lá thư từ Haru (Nana Mori), mối tình 10 năm trước của anh. Cùng lúc đó, vợ sắp cưới Fujishiro là Yayoi (Masami Nagasawa) đột nhiên biến mất. Fujishiro bắt đầu bước vào hành trình tìm kiếm người người vợ chưa cưới với những kỷ niệm lúc cả hai bên nhau, cùng lúc đó hồi ức tình yêu thanh xuân cũng ùa về. Bộ phim mang màu sắc lãng mạn với nhiều cảnh quay trải dài khắp Tokyo, Uyuni (Bolivia), Prague (Cộng hòa Séc), Iceland và các quốc gia khác trên thế giới."),
            Movie("DORAEMON: NOBITA VÀ BẢN GIAO HƯỞNG ĐỊA CẦU","2024","https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/thumbnail/190x260/2e2b8cd282892c71872b9e67d2cb5039/d/r/drm24_-_poster.jpg","180'","20/2/2024","Kinh dị","Fujishiro Shun (Satoh Takeru) đang chuẩn bị kết hôn. Một ngày tháng Tư, Fujishiro bỗng nhận được lá thư từ Haru (Nana Mori), mối tình 10 năm trước của anh. Cùng lúc đó, vợ sắp cưới Fujishiro là Yayoi (Masami Nagasawa) đột nhiên biến mất. Fujishiro bắt đầu bước vào hành trình tìm kiếm người người vợ chưa cưới với những kỷ niệm lúc cả hai bên nhau, cùng lúc đó hồi ức tình yêu thanh xuân cũng ùa về. Bộ phim mang màu sắc lãng mạn với nhiều cảnh quay trải dài khắp Tokyo, Uyuni (Bolivia), Prague (Cộng hòa Séc), Iceland và các quốc gia khác trên thế giới."),
            Movie("HÀNH TINH KHỈ: VƯƠNG QUỐC MỚI","2024","https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/thumbnail/190x260/2e2b8cd282892c71872b9e67d2cb5039/f/z/fzone_007c_g_vie-vn_4x5_.jpg","180'","20/2/2024","Kinh dị", "Fujishiro Shun (Satoh Takeru) đang chuẩn bị kết hôn. Một ngày tháng Tư, Fujishiro bỗng nhận được lá thư từ Haru (Nana Mori), mối tình 10 năm trước của anh. Cùng lúc đó, vợ sắp cưới Fujishiro là Yayoi (Masami Nagasawa) đột nhiên biến mất. Fujishiro bắt đầu bước vào hành trình tìm kiếm người người vợ chưa cưới với những kỷ niệm lúc cả hai bên nhau, cùng lúc đó hồi ức tình yêu thanh xuân cũng ùa về. Bộ phim mang màu sắc lãng mạn với nhiều cảnh quay trải dài khắp Tokyo, Uyuni (Bolivia), Prague (Cộng hòa Séc), Iceland và các quốc gia khác trên thế giới."),
            Movie("THÁNG TƯ, NGÀY EM ĐẾN","2025","https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/thumbnail/190x260/2e2b8cd282892c71872b9e67d2cb5039/4/7/470wx700h-april.jpg","180'","20/2/2024","Kinh dị","Fujishiro Shun (Satoh Takeru) đang chuẩn bị kết hôn. Một ngày tháng Tư, Fujishiro bỗng nhận được lá thư từ Haru (Nana Mori), mối tình 10 năm trước của anh. Cùng lúc đó, vợ sắp cưới Fujishiro là Yayoi (Masami Nagasawa) đột nhiên biến mất. Fujishiro bắt đầu bước vào hành trình tìm kiếm người người vợ chưa cưới với những kỷ niệm lúc cả hai bên nhau, cùng lúc đó hồi ức tình yêu thanh xuân cũng ùa về. Bộ phim mang màu sắc lãng mạn với nhiều cảnh quay trải dài khắp Tokyo, Uyuni (Bolivia), Prague (Cộng hòa Séc), Iceland và các quốc gia khác trên thế giới."),
            )
    }
}
enum class ListType{
    ROW,COLUMN,GRID
}
@Composable
fun MovieScreen(movies: List<Movie>) {
    var listType by remember { mutableStateOf(ListType.ROW) }
    Column {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { listType = ListType.ROW }) {
                Text("Row")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { listType = ListType.COLUMN }) {
                Text("Column")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { listType = ListType.GRID }) {
                Text("Grid")
            }
        }
        when (listType) {
            ListType.ROW -> MovieRow(movies)
            ListType.COLUMN -> MovieColumn(movies)
            ListType.GRID -> MovieGrid(movies)
        }
    }
}
@Composable
fun MovieRow(movies: List<Movie>) {
    LazyRow(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(movies.size) { index ->
            MovieItem(movie = movies[index], listType = ListType.ROW)
        }
    }
}
@Composable
fun MovieColumn(movies: List<Movie>) {
    LazyColumn(
        state = rememberLazyListState(),
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(movies.size) { index ->
            MovieColumnItem(movie = movies[index], listType =
            ListType.COLUMN)
        }
    }
}
@Composable
fun MovieGrid(movies: List<Movie>) {
    val gridState = rememberLazyStaggeredGridState()

    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        state = gridState,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalItemSpacing = 8.dp,
        contentPadding = PaddingValues(8.dp)
    ) {
        items(movies.size) { index ->
            MovieItem(movie = movies[index], listType = ListType.GRID)
        }
    }
}
@Composable
fun MovieItem(movie: Movie, listType: ListType) {
    Card(
        colors = CardDefaults.cardColors(containerColor =
        Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation =
        6.dp),
    ) {
        Column(
            modifier = Modifier.then(getItemSizeModifier(listType))
        ) {
            AsyncImage(
                model = movie.posterUrl,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
            )
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                text = movie.title,
                style = MaterialTheme.typography.titleSmall,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
                BoldValueText(label = "Thời lượng: ", value =
                movie.duration)
                BoldValueText(label = "Khởi chiếu: ", value =
                movie.releaseDate)
            }
        }
    }
}
@Composable
fun MovieColumnItem(movie: Movie, listType: ListType) {
    Card(
        colors = CardDefaults.cardColors(containerColor =
        Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation =
        6.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            AsyncImage(
                model = movie.posterUrl,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .then(getItemSizeModifier(listType))
                    .wrapContentHeight()
            )

            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.titleSmall,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                BoldValueText(label = "Thời lượng: ", value =
                movie.duration)
                BoldValueText(label = "Khởi chiếu: ", value =
                movie.releaseDate)
                BoldValueText(label = "Thể loại: ", value =
                movie.genre)
                Text(
                    text = "Tóm tắt nội dung",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 4.dp, bottom =
                    2.dp)
                )
                Text(
                    text = movie.shotDescription,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 5,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(end = 2.dp)
                )
            }
        }
    }
}
@Composable
fun BoldValueText(label: String, value: String, style: TextStyle =
    MaterialTheme.typography.bodySmall
) {
    Text(buildAnnotatedString {
        append(label)
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
            append(value)
        }
    }, style = style)
}


@Composable
private fun getItemSizeModifier(listType: ListType): Modifier {
    return when (listType) {
        ListType.ROW -> Modifier.width(175.dp)
        ListType.COLUMN -> Modifier
            .width(130.dp)

        ListType.GRID -> Modifier
            .fillMaxWidth()
    }
}