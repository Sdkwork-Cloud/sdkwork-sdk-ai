package com.sdkwork.ai

data class MusicGenerationRequest(
    val model: String? = null,
    val prompt: String? = null,
    val duration: Int? = null,
    val format: String? = null,
    val n: Int? = null,
    val style: String? = null,
    val metadata: Map<String, String>? = null,
    val negativePrompt: String? = null,
    val responseFormat: String? = null,
    val referenceAudio: String? = null
)
