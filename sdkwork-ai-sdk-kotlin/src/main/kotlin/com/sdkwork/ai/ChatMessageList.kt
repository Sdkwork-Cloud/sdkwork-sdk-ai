package com.sdkwork.ai

data class ChatMessageList(
    val object: String? = null,
    val data: List<ChatMessage>? = null,
    val hasMore: Boolean? = null,
    val firstId: String? = null,
    val lastId: String? = null
)
