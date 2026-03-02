package com.sdkwork.ai

data class ModerationResponse(
    val id: String? = null,
    val model: String? = null,
    val results: List<ModerationResult>? = null
)
