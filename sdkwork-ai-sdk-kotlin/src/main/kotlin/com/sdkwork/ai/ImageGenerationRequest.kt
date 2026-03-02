package com.sdkwork.ai

data class ImageGenerationRequest(
    val model: String? = null,
    val prompt: String? = null,
    val n: Int? = null,
    val quality: String? = null,
    val size: String? = null,
    val style: String? = null,
    val user: String? = null,
    val image: List<String>? = null,
    val extra: Map<String, Any>? = null,
    val responseFormat: String? = null
)
