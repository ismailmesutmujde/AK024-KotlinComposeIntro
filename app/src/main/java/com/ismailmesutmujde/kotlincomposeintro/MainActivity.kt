package com.ismailmesutmujde.kotlincomposeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ismailmesutmujde.kotlincomposeintro.ui.theme.KotlinComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            Greeting(name = "Android")
        }

    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    // Column, Row, Box

    Column {
        CustomText(text = "Hello Android")
        CustomText(text = "Hello World")
        CustomText(text = "Hello Kotlin")
    }


    // Column : alt alta dizer

    /*
    Column {

        Text(
            text = "Hello World!",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }*/

    // Row : yan yana dizer
    /*
    Row {
        Text(
            text = "Hello Android!",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Hello World!",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }*/

    // Box : üst üste dizer
    /*
    Box {
        Text(
            text = "Hello Android!",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Hello World!",
            modifier = modifier,
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }*/
}

@Composable
fun CustomText(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .background(color = Color.Black)
            .padding(top = 10.dp, start = 1.dp, end = 1.dp, bottom = 30.dp)
            .clickable {
                println("hello android clicked")
            }
            //.width(250.dp)
            //.height(200.dp)
            //.size(width = 50.dp, height = 50.dp)
            //.fillMaxWidth(0.5f)
            //.fillMaxHeight(0.5f)
            .fillMaxSize(0.5f),
        color = Color.White,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting("Android")
}