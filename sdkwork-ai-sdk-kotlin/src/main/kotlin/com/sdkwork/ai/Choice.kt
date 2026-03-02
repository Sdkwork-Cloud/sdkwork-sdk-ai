package com.sdkwork.ai

data class Choice(
    val index: Int? = null,
    val message: Message? = null,
    val logprobs: Logprobs? = null,
    val finishReason: String? = null,
    val moderationHitType: String? = null
)
