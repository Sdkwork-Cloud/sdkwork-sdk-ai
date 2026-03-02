package com.sdkwork.ai

data class KnowledgeBaseListResponse(
    val data: List<KnowledgeBaseResponse>? = null,
    val total: Int? = null,
    val hasMore: Boolean? = null
)
