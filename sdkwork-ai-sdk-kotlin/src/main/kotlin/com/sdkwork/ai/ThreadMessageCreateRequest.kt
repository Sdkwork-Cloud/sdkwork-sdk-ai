package com.sdkwork.ai

data class ThreadMessageCreateRequest(
    val role: String? = null,
    val content: Any? = null,
    val attachments: List<Attachment>? = null,
    val metadata: Map<String, String>? = null
)
