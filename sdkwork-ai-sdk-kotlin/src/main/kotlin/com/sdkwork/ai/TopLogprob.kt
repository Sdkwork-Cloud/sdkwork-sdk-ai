package com.sdkwork.ai

data class TopLogprob(
    val token: String? = null,
    val logprob: Double? = null,
    val bytes: List<Int>? = null
)
