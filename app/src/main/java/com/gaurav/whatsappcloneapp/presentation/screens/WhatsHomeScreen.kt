package com.gaurav.whatsappcloneapp.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gaurav.whatsappcloneapp.data.INITIAL_INDEX
import com.gaurav.whatsappcloneapp.data.tabs
import com.gaurav.whatsappcloneapp.presentation.components.AppBarComponent
import com.gaurav.whatsappcloneapp.presentation.components.TabsComponent
import kotlinx.coroutines.launch

@Composable
fun WhatsAppHomeScreen() {
    val coroutineScope = rememberCoroutineScope()
    val pagerState = rememberPagerState(pageCount = { tabs.size })
    Column() {
        AppBarComponent()
        TabsComponent(
            INITIAL_INDEX,
            pagerState,
            onTabSelected = { selectedPage ->
                coroutineScope.launch {
                    pagerState.animateScrollToPage(selectedPage)
                }
            })
        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState
        ) { page ->
            when (page) {
                0 -> ChatsScreen()
                1 -> StatusScreen()
                2 -> CallsScreen()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WhatsAppHomeScreenPreview() {
    WhatsAppHomeScreen()
}