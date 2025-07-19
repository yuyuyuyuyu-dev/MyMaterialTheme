package dev.yuyuyuyuyu.android.androidexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import dev.yuyuyuyuyu.mymaterialtheme.MyMaterialTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyMaterialTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(title = { Text("MyMaterialTheme Example") })
                    },
                ) { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding),
                    ) {
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
    }
}
