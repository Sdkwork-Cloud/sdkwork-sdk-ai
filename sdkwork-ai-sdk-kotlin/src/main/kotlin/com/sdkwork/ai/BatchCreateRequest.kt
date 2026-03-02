package com.sdkwork.ai

data class BatchCreateRequest(
    val endpoint: String? = null,
    val metadata: Map<String, String>? = null,
    val inputFileId: String? = null,
    val completionWindow: String? = null
)
