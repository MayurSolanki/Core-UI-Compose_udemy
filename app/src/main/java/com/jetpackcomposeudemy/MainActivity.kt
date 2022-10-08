package com.jetpackcomposeudemy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.jetpackcomposeudemy.ui.theme.JetpackComposeUdemyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            JetpackComposeUdemyTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                   Greeting("Android")
//                }
//            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize(
                align = Alignment.BottomCenter
            )
        ) {
            Text(
                text = "wrapped content",
                style =MaterialTheme.typography.titleLarge
                )
        }


    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeUdemyTheme {
        //Greeting("Mayur")
        MainScreen()
    }
}
