package com.sdkwork.ai

data class RunStepListResponse(
    val object: String? = null,
    val data: List<RunStepResponse>? = null,
    val hasMore: Boolean? = null,
    val firstId: String? = null,
    val lastId: String? = null
)
