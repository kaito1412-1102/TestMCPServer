package com.example.testantigravity.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun GameDeliverScreen(modifier: Modifier = Modifier) {
    // Dải màu nền xanh từ thiết kế Figma
    val backgroundBrush = Brush.linearGradient(
        colors = listOf(
            Color(0xFF60A0FF), // Blue lighter
            Color(0xFF0465F5)  // Blue darker
        )
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundBrush)
            .padding(24.dp)
    ) {
        // Góc trên bên trái: Các thẻ tiêu đề (Tags)
        Row(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 16.dp, start = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            TagItem(text = "UI Design")
            TagItem(text = "MyFPT")
        }

        // Góc trên bên phải: Logo hoặc biểu tượng ứng dụng
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 16.dp, end = 16.dp)
                .size(64.dp)
                .background(Color.White, shape = RoundedCornerShape(16.dp)),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = "https://www.figma.com/api/mcp/asset/d91af0d8-3edc-4c34-b1df-ec613e2d41dc",
                contentDescription = "Logo",
                modifier = Modifier.size(40.dp)
            )
        }

        // Nội dung chính ở trung tâm/trái
        Column(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 16.dp)
        ) {
            Text(
                text = "GAME FPT 35",
                color = Color.White,
                fontSize = 42.sp,
                fontWeight = FontWeight.Black,
                lineHeight = 48.sp
            )
            Text(
                text = "[Deliver]",
                color = Color.White,
                fontSize = 42.sp,
                fontWeight = FontWeight.Black,
                lineHeight = 48.sp
            )
        }

        // Góc dưới bên trái: PIC info
        Text(
            text = "PIC: AnhLH30",
            color = Color.White.copy(alpha = 0.9f),
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 16.dp, bottom = 32.dp)
        )

        // Góc dưới bên phải: Mascot
        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .size(240.dp)
        ) {
            AsyncImage(
                model = "https://www.figma.com/api/mcp/asset/ceefd1eb-1701-4927-8c67-0f82bc470791",
                contentDescription = "Mascot",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
fun TagItem(text: String) {
    Box(
        modifier = Modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(
                    topStart = 4.dp,
                    topEnd = 16.dp,
                    bottomEnd = 4.dp,
                    bottomStart = 4.dp
                )
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = text,
            color = Color(0xFF222222),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true, widthDp = 800, heightDp = 480)
@Composable
fun GameDeliverScreenPreview() {
    GameDeliverScreen()
}
