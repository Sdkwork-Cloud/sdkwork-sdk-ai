package com.sdkwork.ai

data class Attachment(
    val tools: List<Map<String, Any>>? = null,
    val fileId: String? = null
)
