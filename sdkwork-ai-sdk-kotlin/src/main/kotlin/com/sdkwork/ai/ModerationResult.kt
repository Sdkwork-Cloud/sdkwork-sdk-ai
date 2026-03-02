package com.sdkwork.ai

data class ModerationResult(
    val flagged: Boolean? = null,
    val categories: Categories? = null,
    val categoryScores: CategoryScores? = null
)
