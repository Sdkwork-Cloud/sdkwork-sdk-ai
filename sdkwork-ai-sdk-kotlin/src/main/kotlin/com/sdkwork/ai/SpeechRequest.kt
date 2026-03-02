package com.sdkwork.ai

data class SpeechRequest(
    val model: String? = null,
    val input: String? = null,
    val voice: String? = null,
    val speed: Double? = null,
    val extra: Map<String, Any>? = null,
    val responseFormat: String? = null
)
