package com.sdkwork.ai

data class ChatMessage(
    val role: String? = null,
    val content: Any? = null,
    val name: String? = null,
    val refusal: String? = null,
    val audio: Audio? = null,
    val annotations: List<Annotation>? = null,
    val toolCalls: List<ToolCall>? = null,
    val toolCallId: String? = null
)
