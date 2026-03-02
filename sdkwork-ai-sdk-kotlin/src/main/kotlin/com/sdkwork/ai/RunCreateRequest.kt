package com.sdkwork.ai

data class RunCreateRequest(
    val model: String? = null,
    val instructions: String? = null,
    val tools: List<Any>? = null,
    val metadata: Map<String, String>? = null,
    val temperature: Double? = null,
    val stream: Boolean? = null,
    val assistantId: String? = null,
    val additionalInstructions: String? = null,
    val additionalMessages: List<Map<String, Any>>? = null,
    val toolResources: Map<String, Any>? = null,
    val topP: Double? = null,
    val maxPromptTokens: Int? = null,
    val maxCompletionTokens: Int? = null,
    val truncationStrategy: TruncationStrategy? = null
)
