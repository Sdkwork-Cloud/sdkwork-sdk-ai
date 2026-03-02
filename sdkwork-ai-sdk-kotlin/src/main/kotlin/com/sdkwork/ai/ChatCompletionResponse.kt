package com.sdkwork.ai

data class ChatCompletionResponse(
    val id: String? = null,
    val object: String? = null,
    val created: Int? = null,
    val model: String? = null,
    val choices: List<Choice>? = null,
    val usage: Usage? = null,
    val systemFingerprint: String? = null,
    val serviceTier: String? = null
)
