package com.sdkwork.ai

data class EmbeddingResponse(
    val object: String? = null,
    val data: List<Embedding>? = null,
    val model: String? = null,
    val usage: Usage? = null
)
