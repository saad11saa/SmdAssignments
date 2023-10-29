package com.example.a2screen2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a2screen2.ui.theme.A2screen2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A2screen2Theme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
        ) {
            Column(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(16.dp, 8.dp),
                ) {
                    Column(modifier = Modifier.weight(1f))
                    {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                            tint = Color.Gray,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                    Column(modifier = Modifier.weight(3f)) {
                        Text(
                            text = "LOCATIONS",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF666666)
                        )
                    }
                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.End
                    )
                    {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = null,
                            tint = Color.Gray,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                        .padding(28.dp),
                ) {
                    Text(
                        text = "You are currently getting results from popular places from India",
                        fontSize = 20.sp,
                        color = Color.Gray
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(start = 40.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {},
                        modifier = Modifier.width(150.dp),
                        colors = ButtonDefaults.buttonColors(Color.Gray)
                    ) {
                        Text(text = "Choose place", color = Color.Blue  )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Gray),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = Color(0xFF666666),
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "ADD PLACE",
                    color = Color(0xFF666666),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF333399))
                .weight(1f)
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 30.dp, vertical = 30.dp),
            ) {
                Text("Mumbai", fontSize = 35.sp, textAlign = TextAlign.Center, color = Color.White)
                Text("Humidity : 51%", fontSize = 20.sp, textAlign = TextAlign.Center, color = Color(0xFF555555)
                )
            }

            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("28, Sunny", fontSize = 20.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, color = Color(0xFFE65100))
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 30.dp, vertical = 30.dp),
            ) {
                Text("Indore", fontSize = 35.sp, textAlign = TextAlign.Center, color = Color(0xFF666666))
                Text("Humidity : 35%", fontSize = 20.sp, textAlign = TextAlign.Center, color = Color(0xFF555555)
                )
            }

            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("24, Smoke", fontSize = 20.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, color = Color(0xFF333399))
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 30.dp, vertical = 30.dp),
            ) {
                Text("Bhopal", fontSize = 35.sp, textAlign = TextAlign.Center, color = Color(0xFF666666))
                Text("Humidity : 35%", fontSize = 20.sp, textAlign = TextAlign.Center, color = Color(0xFF555555)
                )
            }

            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("21, Clear", fontSize = 20.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, color = Color(0xFF333399))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    A2screen2Theme() {
        Greeting()
    }
}
