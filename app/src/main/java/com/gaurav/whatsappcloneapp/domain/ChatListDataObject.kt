package com.gaurav.whatsappcloneapp.domain

import com.gaurav.whatsappcloneapp.R

data class ChatListDataObject(
    val chatId: Int,
    val message: Message,
    val username: String,
    val userProfilePic: Int= R.drawable.ic_user_pic
)

data class Message(
    val content: String,
    val deliveryStatus: MessageDeliveryStatus,
    val messageType: MessageType,
    val timestamp: String,
    val unreadCount: Int?=null
)

enum class MessageDeliveryStatus {
    DELIVERED,
    READ,
    PENDING,
    ERROR
}

enum class MessageType {
    TEXT,
    AUDIO,
    VIDEO,
    IMAGE
}