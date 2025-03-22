package com.gaurav.whatsappcloneapp.presentation.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gaurav.whatsappcloneapp.data.chatList
import com.gaurav.whatsappcloneapp.domain.ChatListDataObject
import com.gaurav.whatsappcloneapp.presentation.components.UserDetails
import com.gaurav.whatsappcloneapp.presentation.components.UserImage

@Composable
fun ChatsScreen() {


    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
        items(chatList) { chatData ->
            ChatListItem(chatData)
        }
    }

}

@Composable
fun ChatListItem(chatData: ChatListDataObject) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        UserImage(chatData.userProfilePic)
        UserDetails(chatData)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ChatsScreenPreview() {
    ChatsScreen()
}