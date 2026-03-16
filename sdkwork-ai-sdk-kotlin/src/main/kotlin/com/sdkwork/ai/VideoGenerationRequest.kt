package com.sdkwork.ai

data class VideoGenerationRequest(
    val prompt: String? = null,
    val model: String? = null,
    val seconds: String? = null,
    val size: String? = null,
    val quality: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    val seed: Int? = null,
    val user: String? = null,
    val negativePrompt: String? = null,
    val imageUrls: List<String>? = null,
    val aspectRatio: String? = null,
    val responseFormat: String? = null
)
