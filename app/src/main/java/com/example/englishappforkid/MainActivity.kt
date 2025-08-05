package com.example.englishappforkid // Hoặc package của bạn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.englishappforkid.ui.home.ContentListScreen // Import màn hình danh sách của bạn
import com.example.englishappforkid.ui.theme.EnglishAppForKidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Bỏ dòng setContentView và dùng setContent của Compose
        setContent {
            EnglishAppForKidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Gọi màn hình danh sách bạn đã tạo
                    ContentListScreen()
                }
            }
        }
    }
}