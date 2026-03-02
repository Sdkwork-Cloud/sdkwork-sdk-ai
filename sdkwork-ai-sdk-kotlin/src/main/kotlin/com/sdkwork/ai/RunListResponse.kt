package com.sdkwork.ai

data class RunListResponse(
    val object: String? = null,
    val data: List<RunResponse>? = null,
    val hasMore: Boolean? = null,
    val firstId: String? = null,
    val lastId: String? = null
)
