package com.sdkwork.ai

data class DocumentResponse(
    val title: String? = null,
    val type: String? = null,
    val status: String? = null,
    val metadata: Map<String, Any>? = null,
    val documentId: String? = null,
    val knowledgeBaseId: String? = null,
    val chunkCount: Int? = null,
    val createdAt: Int? = null,
    val updatedAt: Int? = null
)
