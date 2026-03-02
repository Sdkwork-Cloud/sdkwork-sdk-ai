package com.sdkwork.ai

data class AssistantCreateRequest(
    val model: String? = null,
    val name: String? = null,
    val description: String? = null,
    val instructions: String? = null,
    val tools: List<Tool>? = null,
    val metadata: Map<String, String>? = null,
    val temperature: Double? = null,
    val toolResources: Map<String, Any>? = null,
    val responseFormat: ResponseFormat? = null,
    val topP: Double? = null
)
