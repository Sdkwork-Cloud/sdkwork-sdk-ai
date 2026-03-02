package com.sdkwork.ai

data class Content(
    val token: String? = null,
    val logprob: Double? = null,
    val bytes: List<Int>? = null,
    val topLogprobs: List<TopLogprob>? = null
)
