package com.sdkwork.ai

data class ContextResponse(
    val id: String? = null,
    val object: String? = null,
    val created: Int? = null,
    val model: String? = null,
    val mode: String? = null,
    val ttl: Int? = null,
    val truncationStrategy: TruncationStrategy? = null,
    val usage: Usage? = null
)
