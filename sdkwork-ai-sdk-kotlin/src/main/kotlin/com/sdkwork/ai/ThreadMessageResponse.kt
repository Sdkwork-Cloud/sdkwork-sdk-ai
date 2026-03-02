package com.sdkwork.ai

data class ThreadMessageResponse(
    val id: String? = null,
    val object: String? = null,
    val role: String? = null,
    val status: String? = null,
    val content: List<ContentBlock>? = null,
    val metadata: Map<String, String>? = null,
    val createdAt: Int? = null,
    val threadId: String? = null,
    val incompleteDetails: Any? = null,
    val completedAt: Int? = null,
    val incompleteAt: Int? = null,
    val assistantId: String? = null,
    val runId: String? = null,
    val fileIds: List<String>? = null
)
