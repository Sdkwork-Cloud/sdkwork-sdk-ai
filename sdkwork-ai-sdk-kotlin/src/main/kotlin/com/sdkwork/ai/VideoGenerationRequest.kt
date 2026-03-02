package com.sdkwork.ai

data class VideoGenerationRequest(
    val prompt: String? = null,
    val model: String? = null,
    val seconds: String? = null,
    val size: String? = null,
    val quality: String? = null,
    val user: String? = null,
    val negativePrompt: String? = null,
    val imageUrls: List<String>? = null
)
