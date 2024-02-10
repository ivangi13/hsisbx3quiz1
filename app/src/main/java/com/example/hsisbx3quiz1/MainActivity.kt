package com.example.hsisbx3quiz1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hsisbx3quiz1.ui.theme.Hsisbx3quiz1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hsisbx3quiz1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Hsisbx3quiz1()
                }
            }
        }
    }
}

@Composable
fun Hsisbx3quiz1(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.ic_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .size(160.dp)
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Color.LightGray)
        ) {
            Text(
                text = stringResource(R.string.isi_form_text),
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(10.dp)
            )
            Text(
                text = stringResource(R.string.isi_cv_text),
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                modifier = modifier.padding(10.dp)
            )
            Image(
                painter = painterResource(R.drawable.ic_resume),
                contentDescription = null,
                modifier = modifier
                    .size(120.dp)
                    .padding(10.dp)
                    .background(Color.Magenta)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Lewati",
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    color = Color.Blue,
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White)
                        .padding(vertical = 5.dp, horizontal = 30.dp)
                )
                Text(
                    text = "Isi CV",
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    color = Color.White,
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.Blue)
                        .padding(vertical = 5.dp, horizontal = 30.dp)
                )
            }
        }
    }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom,
        modifier = modifier
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_home),
                contentDescription = null,
                modifier = modifier
                    .size(25.dp)
            )
            Text(
                text = "Home",
                modifier = Modifier.padding(2.dp),
                textAlign = TextAlign.Center,
                fontSize = 10.sp
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_search),
                contentDescription = null,
                modifier = modifier
                    .size(25.dp)
            )
            Text(
                text = "Pencarian",
                modifier = Modifier.padding(2.dp),
                textAlign = TextAlign.Center,
                fontSize = 10.sp
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_profil),
                contentDescription = null,
                modifier = modifier
                    .size(25.dp)
            )
            Text(
                text = "Profil",
                modifier = Modifier.padding(2.dp),
                textAlign = TextAlign.Center,
                fontSize = 10.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Hsisbx3quiz1Preview() {
    Hsisbx3quiz1Theme {
        Hsisbx3quiz1()
    }
}