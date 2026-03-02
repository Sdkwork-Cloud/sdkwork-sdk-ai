package com.sdkwork.ai

data class Segment(
    val id: Int? = null,
    val seek: Int? = null,
    val start: Double? = null,
    val end: Double? = null,
    val text: String? = null,
    val tokens: List<Int>? = null,
    val temperature: Double? = null,
    val avgLogprob: Double? = null,
    val compressionRatio: Double? = null,
    val noSpeechProb: Double? = null
)
