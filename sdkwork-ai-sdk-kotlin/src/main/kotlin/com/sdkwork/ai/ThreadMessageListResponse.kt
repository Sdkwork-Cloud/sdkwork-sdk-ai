package com.sdkwork.ai

data class ThreadMessageListResponse(
    val object: String? = null,
    val data: List<ThreadMessageResponse>? = null,
    val hasMore: Boolean? = null,
    val firstId: String? = null,
    val lastId: String? = null
)
