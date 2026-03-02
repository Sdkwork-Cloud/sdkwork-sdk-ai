package com.sdkwork.ai

data class SearchResult(
    val content: String? = null,
    val score: Double? = null,
    val metadata: Map<String, Any>? = null,
    val documentId: String? = null,
    val chunkId: String? = null
)
