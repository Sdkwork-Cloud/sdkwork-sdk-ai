package com.sdkwork.ai

data class KnowledgeBaseResponse(
    val name: String? = null,
    val description: String? = null,
    val status: String? = null,
    val knowledgeBaseId: String? = null,
    val embeddingModelId: String? = null,
    val indexType: String? = null,
    val createdAt: Int? = null,
    val updatedAt: Int? = null,
    val docCount: Int? = null
)
