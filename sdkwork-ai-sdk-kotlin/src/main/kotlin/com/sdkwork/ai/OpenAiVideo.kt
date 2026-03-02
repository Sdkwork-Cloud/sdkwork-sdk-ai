package com.sdkwork.ai

data class OpenAiVideo(
    val id: String? = null,
    val object: String? = null,
    val model: String? = null,
    val status: String? = null,
    val progress: Int? = null,
    val prompt: String? = null,
    val seconds: String? = null,
    val size: String? = null,
    val quality: String? = null,
    val error: VideoError? = null,
    val createdAt: Int? = null,
    val completedAt: Int? = null,
    val expiresAt: Int? = null,
    val outputUrl: String? = null,
    val remixedFromVideoId: String? = null
)
