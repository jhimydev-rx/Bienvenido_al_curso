package com.example.bienvenidoalcurso


import android.os.Bundle
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface (
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background,
            ){
                GreetingCard()
            }
        }
    }
}


@Composable
fun GreetingCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB8E1BF)),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Columan vacia
            Column (modifier = Modifier
                .weight(3f)
                .fillMaxWidth()){  }

            //Columna foto mas texto
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .weight(3f)
                .fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        modifier = Modifier
                            .size(120.dp)
                            .background(Color(0xFF09142B))
                            .padding(16.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.android_logo),
                            contentDescription = "Course Image",
                            modifier = Modifier.size(100.dp)
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Jennifer Doe",
                        fontSize = 35.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Android Developer Extraordinaire",
                        color = Color(0xFF2B4D1B),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
            //Columna Vacia
            Column(modifier = Modifier
                .fillMaxWidth()
                .weight(2f)){}


            //Columna Contacto
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Columna de ICONOS
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Icon(Icons.Default.Phone, tint = Color(0xFF215534), contentDescription = "Phone")
                        Icon(Icons.Default.Info, tint = Color(0xFF215534), contentDescription = "User")
                        Icon(Icons.Default.Email, tint = Color(0xFF215534) ,contentDescription = "Email")
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    // Columna de TEXTOS
                    Column(
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Text(
                            text = "+11 (123) 444 555 666",
                            fontSize = 16.sp,
                            fontFamily = FontFamily.SansSerif,
                        )
                        Text(
                            text = "@AndroidDev",
                            fontSize = 16.sp,
                            fontFamily = FontFamily.SansSerif,
                        )
                        Text(
                            text = "jen.doe@android.com",
                            fontSize = 16.sp,
                            fontFamily = FontFamily.SansSerif,
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewGreetingCard() {
    GreetingCard()
}