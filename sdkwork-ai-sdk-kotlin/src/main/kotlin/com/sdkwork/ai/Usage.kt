package com.sdkwork.ai

data class Usage(
    val promptTokens: Int? = null,
    val completionTokens: Int? = null,
    val totalTokens: Int? = null,
    val promptTokensDetails: PromptTokensDetails? = null,
    val completionTokensDetails: CompletionTokensDetails? = null
)
