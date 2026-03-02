package com.sdkwork.ai

data class ThreadCreateRequest(
    val messages: List<Message>? = null,
    val metadata: Map<String, String>? = null,
    val toolResources: Map<String, Any>? = null
)
