package dev.yuyuyuyuyu.mymaterialtheme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable

@Composable
fun MyMaterialTheme(
    typography: Typography = MaterialTheme.typography,
    content: @Composable () -> Unit,
) = MyMaterialTheme(
    colorScheme = if (isSystemInDarkTheme()) darkScheme else lightScheme,
    typography = typography,
    content = content,
)

@Composable
internal fun MyMaterialTheme(
    colorScheme: ColorScheme,
    typography: Typography,
    content: @Composable (() -> Unit),
) = MaterialTheme(
    colorScheme = colorScheme,
    typography = typography,
    content = content,
)
