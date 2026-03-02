package com.sdkwork.ai

data class TranscriptionResponse(
    val text: String? = null,
    val task: String? = null,
    val language: String? = null,
    val duration: Double? = null,
    val words: List<Word>? = null,
    val segments: List<Segment>? = null
)
