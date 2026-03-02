package com.sdkwork.ai

data class RerankResponse(
    val id: String? = null,
    val object: String? = null,
    val model: String? = null,
    val results: List<Result>? = null,
    val usage: Usage? = null
)
