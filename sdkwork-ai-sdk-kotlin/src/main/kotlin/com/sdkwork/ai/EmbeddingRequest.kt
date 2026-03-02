package com.sdkwork.ai

data class EmbeddingRequest(
    val model: String? = null,
    val input: Any? = null,
    val dimensions: Int? = null,
    val user: String? = null,
    val encodingFormat: String? = null
)
