package com.sdkwork.ai

data class ThreadResponse(
    val id: String? = null,
    val object: String? = null,
    val metadata: Map<String, String>? = null,
    val createdAt: Int? = null,
    val toolResources: Map<String, Any>? = null
)
