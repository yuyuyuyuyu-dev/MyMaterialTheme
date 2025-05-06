package dev.yuyuyuyuyu.mymaterialtheme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import dev.yuyuyuyuyu.createtypography.createTypographyFrom

@Composable
fun MyMaterialTheme(content: @Composable () -> Unit): Unit = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
    val context = LocalContext.current

    MyMaterialTheme(
    colorScheme = if (isSystemInDarkTheme()) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context),
    typography = createTypographyFrom(fontName = "Yomogi"),
    content = content,
    )
} else {
    MyMaterialTheme(content = content)
}
