package com.sdkwork.ai

data class RunStepResponse(
    val id: String? = null,
    val object: String? = null,
    val type: String? = null,
    val status: String? = null,
    val metadata: Map<String, String>? = null,
    val createdAt: Int? = null,
    val assistantId: String? = null,
    val threadId: String? = null,
    val runId: String? = null,
    val stepDetails: Any? = null,
    val lastError: Any? = null,
    val expiredAt: Int? = null,
    val cancelledAt: Int? = null,
    val failedAt: Int? = null,
    val completedAt: Int? = null
)
