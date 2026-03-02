package com.sdkwork.ai

data class SunoMusic(
    val id: String? = null,
    val object: String? = null,
    val title: String? = null,
    val status: String? = null,
    val duration: Int? = null,
    val tags: List<String>? = null,
    val genre: String? = null,
    val audioUrl: String? = null,
    val lyrics: String? = null,
    val instrumental: Boolean? = null,
    val error: MusicError? = null,
    val createdAt: Int? = null,
    val completedAt: Int? = null
)
