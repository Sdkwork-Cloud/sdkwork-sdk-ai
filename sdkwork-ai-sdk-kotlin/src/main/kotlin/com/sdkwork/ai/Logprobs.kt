package com.sdkwork.ai

data class Logprobs(
    val content: List<Content>? = null,
    val refusal: List<Content>? = null
)
