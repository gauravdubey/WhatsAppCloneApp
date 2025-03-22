package com.gaurav.whatsappcloneapp.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gaurav.whatsappcloneapp.domain.ChatListDataObject
import com.gaurav.whatsappcloneapp.domain.Message
import com.gaurav.whatsappcloneapp.domain.MessageDeliveryStatus
import com.gaurav.whatsappcloneapp.domain.MessageType
import com.gaurav.whatsappcloneapp.ui.theme.blackColor
import com.gaurav.whatsappcloneapp.ui.theme.grayColor
import com.gaurav.whatsappcloneapp.ui.theme.greenColor
import com.gaurav.whatsappcloneapp.ui.theme.whiteColor

@Composable
fun UserDetails(chatData: ChatListDataObject) {

    Column(
        modifier = Modifier
            .wrapContentSize()
            .padding(start = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        MessageHeader(chatData)
        MessageSubSection(chatData)
    }

}


@Composable
fun MessageHeader(chatData: ChatListDataObject) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent(
            modifier = Modifier.weight(1f),
            value = chatData.username,
            fontSize = 16.sp,
            colorValue = blackColor,
            fontWeight = FontWeight.SemiBold
        )
        TextComponent(
            value = chatData.message.timestamp,
            fontSize = 12.sp,
            colorValue = if((chatData.message.unreadCount ?: 0) > 0) greenColor else grayColor,
            modifier = null
        )
    }
}

@Composable
fun MessageSubSection(chatData: ChatListDataObject) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent(
            value = chatData.message.content,
            fontSize = 16.sp,
            colorValue = grayColor,
            modifier = Modifier.weight(1f),
        )
        chatData.message.unreadCount?.also { unreadCount ->

            CircularCountComponent(
                unreadCount = unreadCount.toString(),
                backgroundColor= greenColor,
                textColorValue= whiteColor
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserDetailsPreview() {
    UserDetails(
        chatData = ChatListDataObject(
            chatId = 1,
            message = Message(
                content = "Hello, how are you?",
                deliveryStatus = MessageDeliveryStatus.DELIVERED,
                messageType = MessageType.TEXT,
                timestamp = "23/03/2025"
            ),
            username = "Virat Kohli"
        )
    )
}