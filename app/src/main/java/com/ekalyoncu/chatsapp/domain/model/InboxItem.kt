package com.ekalyoncu.chatsapp.domain.model

sealed class Status{
    object Sent: Status()
    object Delivered: Status()
    object Read: Status()
    object Received: Status()
}

data class InboxItem(
    val image: Int,
    val from: String,
    val lastMessage: String,
    val timeStamp: String,
    val status: Status
)