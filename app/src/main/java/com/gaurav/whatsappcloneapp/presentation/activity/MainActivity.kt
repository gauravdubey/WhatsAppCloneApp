package com.gaurav.whatsappcloneapp.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.gaurav.whatsappcloneapp.presentation.screens.WhatsAppHomeScreen
import com.gaurav.whatsappcloneapp.presentation.ui.theme.WhatsAppCloneAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WhatsAppCloneAppTheme {
                WhatsAppHomeScreen()
            }
        }
    }
}

