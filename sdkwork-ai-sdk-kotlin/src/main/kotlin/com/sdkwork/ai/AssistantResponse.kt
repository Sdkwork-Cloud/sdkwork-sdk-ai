package com.sdkwork.ai

data class AssistantResponse(
    val id: String? = null,
    val object: String? = null,
    val model: String? = null,
    val name: String? = null,
    val description: String? = null,
    val instructions: String? = null,
    val tools: List<Any>? = null,
    val metadata: Map<String, String>? = null,
    val temperature: Double? = null,
    val createdAt: Int? = null,
    val toolResources: Map<String, Any>? = null,
    val responseFormat: Any? = null,
    val topP: Double? = null
)
