package trungmvph44499.fpoly.slide3_ph44499.Lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import trungmvph44499.fpoly.slide3_ph44499.R

class Bai2Lab5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            LightSwitch()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LightSwitch() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val isChecked = remember { mutableStateOf(false) }
        if (isChecked.value) {
            Image(
                painter = painterResource(id = R.drawable.bulb_on1),
                contentDescription = "Light is On",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        } else {
            Image(
                painter = painterResource(id =
                R.drawable.bulb_off1),
                contentDescription = "Light is Off",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Switch(
            checked = isChecked.value,
            onCheckedChange = { isChecked.value = it },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Green,
                uncheckedThumbColor = Color.Gray,
                checkedTrackColor = Color.Green.copy(alpha = 0.5f),
                uncheckedTrackColor = Color.Gray.copy(alpha =
                0.5f),
                checkedBorderColor = Color.Green.copy(alpha =
                0.75f),
            )
        )
    }
}




