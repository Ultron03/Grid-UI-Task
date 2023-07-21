package com.example.buildagrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buildagrid.ui.theme.BuildaGridTheme
import com.example.buildagrid.ui.theme.Purple40
import com.example.buildagrid.ui.theme.PurpleGrey40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuildaGridTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
val bgColor = Color(243,220,254)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column(modifier = modifier.fillMaxHeight().fillMaxWidth().padding(10.dp)){

        Row(
            modifier = modifier.background(bgColor)
                .fillMaxWidth()
        ) {
            Image(painter = painterResource(id = R.drawable.fashion), contentDescription = "fashion" )
            Column( modifier = modifier.padding(3.dp)) {
                Text(
                    text = "Hello $name!",
                    modifier = modifier.padding(start=6.dp)
                )

                Image(painter = painterResource(id = R.drawable.baseline_grain_24),
                    contentDescription = null,
                    modifier = modifier
                        .size(12.dp)
                        .padding(top = 5.dp)
                        .background(Color(234,220,254))
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BuildaGridTheme {
        Greeting("Android")
    }
}