package com.gaurav.whatsappcloneapp.data

import com.gaurav.whatsappcloneapp.domain.ChatListDataObject
import com.gaurav.whatsappcloneapp.domain.Message
import com.gaurav.whatsappcloneapp.domain.MessageDeliveryStatus
import com.gaurav.whatsappcloneapp.domain.MessageType

val chatList = listOf(
    ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Hello, how are you?",
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            messageType = MessageType.TEXT,
            timestamp = "23/03/2025",
            unreadCount = 1
        ),
        username = "Virat Kohli"
    ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "Let's catch up tomorrow.",
            deliveryStatus = MessageDeliveryStatus.READ,
            messageType = MessageType.TEXT,
            timestamp = "22/03/2025",
            unreadCount = null
        ),
        username = "MS Dhoni"
    ),
    ChatListDataObject(
        chatId = 3,
        message = Message(
            content = "Check out this image!",
            deliveryStatus = MessageDeliveryStatus.PENDING,
            messageType = MessageType.IMAGE,
            timestamp = "21/03/2025",
            unreadCount = 2
        ),
        username = "Rohit Sharma"
    ),
    ChatListDataObject(
        chatId = 4,
        message = Message(
            content = "Meeting at 3 PM, don't be late!",
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            messageType = MessageType.TEXT,
            timestamp = "20/03/2025",
            unreadCount = 5
        ),
        username = "Sachin Tendulkar"
    ),
    ChatListDataObject(
        chatId = 5,
        message = Message(
            content = "Check your email, I sent the details.",
            deliveryStatus = MessageDeliveryStatus.ERROR,
            messageType = MessageType.TEXT,
            timestamp = "19/03/2025",
            unreadCount = 4
        ),
        username = "Rahul Dravid"
    ),
    ChatListDataObject(
        chatId = 6,
        message = Message(
            content = "Here's the document you requested.",
            deliveryStatus = MessageDeliveryStatus.READ,
            messageType = MessageType.AUDIO,
            timestamp = "18/03/2025",
            unreadCount = null
        ),
        username = "Kapil Dev"
    ),
    ChatListDataObject(
        chatId = 7,
        message = Message(
            content = "Happy Birthday! 🎉",
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            messageType = MessageType.TEXT,
            timestamp = "17/03/2025",
            unreadCount = 3
        ),
        username = "Sourav Ganguly"
    )
)
