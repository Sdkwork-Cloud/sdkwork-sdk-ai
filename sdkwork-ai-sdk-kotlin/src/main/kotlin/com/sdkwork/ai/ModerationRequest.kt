package com.sdkwork.ai

data class ModerationRequest(
    val model: String? = null,
    val input: Any? = null,
    val user: String? = null
)
