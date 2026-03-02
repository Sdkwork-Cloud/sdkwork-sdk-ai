package com.sdkwork.ai

data class RunResponse(
    val id: String? = null,
    val object: String? = null,
    val status: String? = null,
    val model: String? = null,
    val instructions: String? = null,
    val tools: List<Any>? = null,
    val metadata: Map<String, String>? = null,
    val usage: Usage? = null,
    val temperature: Double? = null,
    val createdAt: Int? = null,
    val threadId: String? = null,
    val assistantId: String? = null,
    val requiredAction: RequiredAction? = null,
    val lastError: LastError? = null,
    val expiresAt: Int? = null,
    val startedAt: Int? = null,
    val cancelledAt: Int? = null,
    val failedAt: Int? = null,
    val completedAt: Int? = null,
    val toolResources: Map<String, Any>? = null,
    val topP: Double? = null,
    val maxPromptTokens: Int? = null,
    val maxCompletionTokens: Int? = null,
    val truncationStrategy: Any? = null
)
