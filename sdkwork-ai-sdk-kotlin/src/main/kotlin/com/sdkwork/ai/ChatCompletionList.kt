package com.sdkwork.ai

data class ChatCompletionList(
    val object: String? = null,
    val data: List<ChatCompletionResponse>? = null,
    val hasMore: Boolean? = null,
    val firstId: String? = null,
    val lastId: String? = null
)
