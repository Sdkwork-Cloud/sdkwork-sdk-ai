package com.sdkwork.ai

data class BatchListResponse(
    val object: String? = null,
    val data: List<BatchResponse>? = null,
    val hasMore: Boolean? = null,
    val firstId: String? = null,
    val lastId: String? = null
)
