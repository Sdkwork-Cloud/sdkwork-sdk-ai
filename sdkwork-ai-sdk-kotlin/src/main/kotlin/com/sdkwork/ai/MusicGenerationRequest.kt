package com.sdkwork.ai

data class MusicGenerationRequest(
    val model: String? = null,
    val prompt: String? = null,
    val negativePrompt: String? = null,
    val duration: Int? = null,
    val format: String? = null,
    val n: Int? = null,
    val referenceAudio: String? = null,
    val style: String? = null,
    val metadata: Map<String, String>? = null,
    val responseFormat: String? = null
)
