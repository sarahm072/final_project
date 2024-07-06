package com.example.app

import android.graphics.drawable.shapes.RoundRectShape
import android.inputmethodservice.Keyboard.Row
import android.media.Image
import android.os.Bundle
import android.provider.FontsContract
import android.text.Layout
import android.text.Layout.Alignment
import android.text.Layout.Alignment.ALIGN_NORMAL
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.app.ui.theme.AppTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.MaterialTheme
import androidx.core.provider.FontsContractCompat.Columns
import org.intellij.lang.annotations.JdkConstants.BoxLayoutAxis
import androidx.compose.material3.Surface
//Image
import com.example.app.R
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.text.font.FontStyle


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun App( modifier: Modifier = Modifier) {
        Surface(color = Color.DarkGray) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = androidx.compose.ui.Alignment.Center){
            val imagePainter: Painter = painterResource(R.drawable.dark)

            Image(
                painter = imagePainter,
                contentDescription = "Description for accessibility",
                modifier = Modifier.clip(CircleShape)
                    .size(200.dp)
            )
            Text(text="Tech Savvy", letterSpacing=5.sp, color =Color.White)

         }
        }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        App()
    }
}
