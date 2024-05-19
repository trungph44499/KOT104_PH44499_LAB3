//package trungmvph44499.fpoly.slide3_ph44499.Lab4
//
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.Column
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
//import trungmvph44499.fpoly.slide3_ph44499.R
//
//class Bai1 : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent{
//            LoginScreen()
//        }
//    }
//}
//@Preview(showBackground = true)
//@Composable
//fun LoginScreen(){
//    val context = LocalContext.current
//    var userName by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//    Column {
//        Image(painter = painterResource(id =
//        R.drawable.logo_line), contentDescription =
//        "Logo")
//        TextField(value = userName, onValueChange = {
//            userName = it }, label = { Text(text = "UserName") })
//        TextField(value = password, onValueChange = {
//            password = it }, label = { Text(text = "Password") })
//        Button(onClick = {
//            Toast.makeText(context, "Enter userName $userName
//                    password $password", Toast.LENGTH_LONG).show()
//        }) {
//            Text(text = "Login")
//        }
//    }
//}