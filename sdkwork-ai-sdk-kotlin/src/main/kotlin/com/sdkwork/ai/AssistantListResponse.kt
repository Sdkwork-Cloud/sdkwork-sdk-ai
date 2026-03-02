package com.sdkwork.ai

data class AssistantListResponse(
    val object: String? = null,
    val data: List<AssistantResponse>? = null,
    val hasMore: Boolean? = null,
    val firstId: String? = null,
    val lastId: String? = null
)
