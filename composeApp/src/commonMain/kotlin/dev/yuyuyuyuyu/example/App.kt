package dev.yuyuyuyuyu.example

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Terminal
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
            bottomBar = {
                NavigationBar {
                    NavigationBarItem(
                        selected = true,
                        onClick = {},
                        icon = { Icon(Icons.Default.Home, contentDescription = null) },
                        label = { Text("Home") },
                    )

                    NavigationBarItem(
                        selected = false,
                        onClick = {},
                        icon = { Icon(Icons.Default.Apps, contentDescription = null) },
                        label = { Text("App") },
                    )

                    NavigationBarItem(
                        selected = false,
                        onClick = {},
                        icon = { Icon(Icons.Default.Book, contentDescription = null) },
                        label = { Text("Book") },
                    )

                    NavigationBarItem(
                        selected = false,
                        onClick = {},
                        icon = { Icon(Icons.Default.Terminal, contentDescription = null) },
                        label = { Text("Terminal") },
                    )
                }
            },
        ) { innerPadding ->
            Box(
                modifier = Modifier.fillMaxSize().padding(innerPadding),
                contentAlignment = Alignment.Center,
            ) {
                Column {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
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