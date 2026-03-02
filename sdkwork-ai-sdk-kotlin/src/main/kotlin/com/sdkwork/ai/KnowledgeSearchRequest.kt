package com.sdkwork.ai

data class KnowledgeSearchRequest(
    val query: String? = null,
    val filters: List<Filter>? = null,
    val knowledgeBaseId: String? = null,
    val topK: Int? = null,
    val scoreThreshold: Double? = null
)
