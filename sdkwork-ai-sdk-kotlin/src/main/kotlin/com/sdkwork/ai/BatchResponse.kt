package com.sdkwork.ai

data class BatchResponse(
    val id: String? = null,
    val object: String? = null,
    val endpoint: String? = null,
    val errors: Errors? = null,
    val status: String? = null,
    val metadata: Map<String, String>? = null,
    val inputFileId: String? = null,
    val outputFileId: String? = null,
    val errorFileId: String? = null,
    val createdAt: Int? = null,
    val completionWindow: String? = null,
    val expiresAt: Int? = null,
    val startedAt: Int? = null,
    val completedAt: Int? = null,
    val failedAt: Int? = null,
    val expiredAt: Int? = null,
    val cancelledAt: Int? = null,
    val requestCounts: RequestCounts? = null
)
