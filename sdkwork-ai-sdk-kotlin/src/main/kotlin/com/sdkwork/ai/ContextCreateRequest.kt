package com.sdkwork.ai

data class ContextCreateRequest(
    val model: String? = null,
    val messages: List<ContextMessage>? = null,
    val mode: String? = null,
    val ttl: Int? = null,
    val truncationStrategy: TruncationStrategy? = null
)
