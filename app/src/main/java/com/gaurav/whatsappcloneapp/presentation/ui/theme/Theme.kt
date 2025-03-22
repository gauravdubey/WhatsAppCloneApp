package com.gaurav.whatsappcloneapp.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import com.gaurav.whatsappcloneapp.ui.theme.Typography
import com.gaurav.whatsappcloneapp.ui.theme.grayColor
import com.gaurav.whatsappcloneapp.ui.theme.greenColor
import com.gaurav.whatsappcloneapp.ui.theme.lightGreenColor
import com.gaurav.whatsappcloneapp.ui.theme.lightGreyColor
import com.gaurav.whatsappcloneapp.ui.theme.whiteColor
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorScheme = darkColorScheme(
    primary = grayColor,
    secondary = lightGreyColor,
    background = lightGreyColor,
    tertiary = whiteColor
)

private val LightColorScheme = lightColorScheme(
    primary = greenColor,
    secondary = lightGreenColor,
    background = whiteColor,
    tertiary = whiteColor

)

@Composable
fun WhatsAppCloneAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        val systemUiController = rememberSystemUiController()
        val statusBarColor = if (darkTheme) DarkColorScheme.primary else LightColorScheme.primary
        val navigationBarColor =
            if (darkTheme) DarkColorScheme.background else LightColorScheme.background

        SideEffect {
//            SystemUiController.setStatusBarColor(statusBarColor)
//            SystemUiController.setNavigationBarColor(navigationBarColor)
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}