package com.sdkwork.ai

data class Message(
    val role: String? = null,
    val content: Any? = null,
    val refusal: String? = null,
    val annotations: List<Any>? = null,
    val reasoningContent: String? = null,
    val toolCalls: List<ToolCall>? = null
)
