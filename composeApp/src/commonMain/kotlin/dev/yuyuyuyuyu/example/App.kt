package dev.yuyuyuyuyu.example

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.mymaterialtheme.MyMaterialTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun App() {
    MyMaterialTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(title = { Text("MyMaterialTheme") })
            },
        ) { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                Row {
                    Button(onClick = {}) {
                        Text("Button")
                    }

                    OutlinedButton(onClick = {}) {
                        Text("OutlinedButton")
                    }
                }
            }
        }
    }
}