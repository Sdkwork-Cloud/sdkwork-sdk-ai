package com.sdkwork.ai

data class KnowledgeBaseCreateRequest(
    val name: String? = null,
    val description: String? = null,
    val extra: Map<String, Any>? = null,
    val embeddingModelId: String? = null,
    val indexType: String? = null
)
