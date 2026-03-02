package com.sdkwork.ai

data class CompletionTokensDetails(
    val reasoningTokens: Int? = null,
    val audioTokens: Int? = null,
    val acceptedPredictionTokens: Int? = null,
    val rejectedPredictionTokens: Int? = null
)
