package com.sdkwork.ai

data class OpenAiFileObject(
    val id: String? = null,
    val object: String? = null,
    val bytes: Int? = null,
    val filename: String? = null,
    val purpose: String? = null,
    val status: String? = null,
    val deleted: Boolean? = null,
    val createdAt: Int? = null,
    val expiresAt: Int? = null,
    val statusDetails: String? = null
)
