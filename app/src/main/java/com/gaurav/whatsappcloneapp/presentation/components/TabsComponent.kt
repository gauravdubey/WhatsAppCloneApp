package com.gaurav.whatsappcloneapp.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gaurav.whatsappcloneapp.data.TabData
import com.gaurav.whatsappcloneapp.data.tabs
import com.gaurav.whatsappcloneapp.ui.theme.greenColor
import com.gaurav.whatsappcloneapp.ui.theme.whiteColor
import kotlinx.coroutines.flow.collectLatest

@Composable
fun TabsComponent(
    initialIndex: Int = 0,
    pagerState: PagerState?,
    onTabSelected: (Int) -> Unit
) {
    var selectedIndex by remember { mutableIntStateOf(initialIndex) }


    LaunchedEffect(pagerState) {
        snapshotFlow {
            pagerState?.currentPage
        }.collectLatest { currentPage ->
            if (currentPage != null) {
                selectedIndex = currentPage
            }
            onTabSelected(selectedIndex)
        }
    }

    TabRow(
        selectedTabIndex = selectedIndex,
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.tertiary,
        indicator = { tabPositions ->
            SecondaryIndicator(
                modifier = Modifier.tabIndicatorOffset(tabPositions[selectedIndex]),
                color = MaterialTheme.colorScheme.tertiary,
                height = 4.dp
            )
        }
    ) {

        tabs.forEachIndexed { index, tabData ->
            Tab(
                selected = index == selectedIndex,
                onClick = {
                    selectedIndex = index
                    onTabSelected(selectedIndex)
                },
                text = {
                    TabContent(tabData)
                }
            )
        }

    }
}

@Composable
fun TabContent(tabData: TabData) {
    if (tabData.unreadCount == null) {
        TabTitle(tabData.title)
    } else {
        TabWithUnreadCount(tabData)
    }
}

@Composable
fun TabTitle(title: String) {
    Text(
        text = title,
        style = TextStyle(
            fontSize = 16.sp
        )
    )
}

@Composable
fun TabWithUnreadCount(tabData: TabData) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TabTitle(tabData.title)
        tabData.unreadCount?.also { unreadCount ->
            CircularCountComponent(
                unreadCount = unreadCount.toString(),
                backgroundColor = MaterialTheme.colorScheme.background,
                textColorValue = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Preview
@Composable
fun TabsComponentPreview() {
    TabsComponent(0, null) {}
}