
package com.nasrii0133.anla

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nasrii0133.anla.ui.theme.ANLATheme

private val Navy = Color(0xFF172B4D)
private val Teal = Color(0xFF16A6A1)
private val Background = Color(0xFFF5F8FA)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ANLATheme {
                ANLAHomeScreen()
            }
        }
    }
}

@Composable
fun ANLAHomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(35.dp))

            Text(
                text = "ANLA",
                fontSize = 38.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Navy,
                letterSpacing = 5.sp
            )

            Text(
                text = "Karmaşık belgeleri kolayca anla.",
                fontSize = 15.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(55.dp))

            Box(
                modifier = Modifier
                    .size(125.dp)
                    .background(
                        color = Color(0xFFDDF3F1),
                        shape = RoundedCornerShape(32.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "▤",
                    fontSize = 65.sp,
                    color = Teal
                )
            }

            Spacer(modifier = Modifier.height(35.dp))

            Text(
                text = "Belgelerini bizimle keşfet",
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold,
                color = Navy
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Metinleri tara, sade açıklamalarını gör ve önemli noktaları kolayca öğren.",
                fontSize = 14.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                lineHeight = 21.sp
            )

            Spacer(modifier = Modifier.height(35.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Teal
                )
            ) {
                Text(
                    text = "Belge Tara",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            OutlinedButton(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text(
                    text = "Galeriden Seç",
                    fontSize = 16.sp,
                    color = Navy
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "ANLA • Belgelerini anlamanın kolay yolu",
                fontSize = 11.sp,
                color = Color.Gray
            )
        }
    }
}
