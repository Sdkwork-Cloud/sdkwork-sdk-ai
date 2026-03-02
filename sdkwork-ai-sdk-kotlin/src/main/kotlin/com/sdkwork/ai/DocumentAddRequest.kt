package com.sdkwork.ai

data class DocumentAddRequest(
    val content: String? = null,
    val title: String? = null,
    val type: String? = null,
    val metadata: Map<String, Any>? = null,
    val chunkConfig: ChunkConfig? = null,
    val knowledgeBaseId: String? = null
)
