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
        username = "Saurav Ganguly"
    ),
    ChatListDataObject(
        chatId = 8,
        message = Message(
            content = "Good morning! Have a great day ahead.",
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            messageType = MessageType.TEXT,
            timestamp = "16/03/2025"
        ),
        username = "Yuvraj Singh"
    ),
    ChatListDataObject(
        chatId = 9,
        message = Message(
            content = "Are you coming to the party tonight?",
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            messageType = MessageType.TEXT,
            timestamp = "15/03/2025"
        ),
        username = "Jasprit Bumrah"
    ),
    ChatListDataObject(
        chatId = 10,
        message = Message(
            content = "Hey, I found this interesting article. Check it out!",
            deliveryStatus = MessageDeliveryStatus.READ,
            messageType = MessageType.IMAGE,
            timestamp = "14/03/2025"
        ),
        username = "Hardik Pandya"
    ),
    ChatListDataObject(
        chatId = 11,
        message = Message(
            content = "I'm running late. See you in 10 minutes.",
            deliveryStatus = MessageDeliveryStatus.PENDING,
            messageType = MessageType.TEXT,
            timestamp = "13/03/2025"
        ),
        username = "Shubman Gill"
    ),
    ChatListDataObject(
        chatId = 12,
        message = Message(
            content = "Can you send me that report?",
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            messageType = MessageType.TEXT,
            timestamp = "12/03/2025"
        ),
        username = "Rishabh Pant"
    ),
    ChatListDataObject(
        chatId = 13,
        message = Message(
            content = "I’ll be on vacation next week.",
            deliveryStatus = MessageDeliveryStatus.ERROR,
            messageType = MessageType.TEXT,
            timestamp = "11/03/2025"
        ),
        username = "KL Rahul"
    ),
    ChatListDataObject(
        chatId = 14,
        message = Message(
            content = "Let's schedule a call for Monday.",
            deliveryStatus = MessageDeliveryStatus.READ,
            messageType = MessageType.VIDEO,
            timestamp = "10/03/2025"
        ),
        username = "Anil Kumble"
    ),
    ChatListDataObject(
        chatId = 15,
        message = Message(
            content = "Great job on the presentation!",
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            messageType = MessageType.VIDEO,
            timestamp = "09/03/2025"
        ),
        username = "Gautam Gambhir"
    )

)
