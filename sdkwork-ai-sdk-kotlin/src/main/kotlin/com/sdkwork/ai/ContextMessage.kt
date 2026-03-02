package com.sdkwork.ai

data class ContextMessage(
    val role: String? = null,
    val content: String? = null,
    val name: String? = null,
    val toolCalls: List<ToolCall>? = null
)
