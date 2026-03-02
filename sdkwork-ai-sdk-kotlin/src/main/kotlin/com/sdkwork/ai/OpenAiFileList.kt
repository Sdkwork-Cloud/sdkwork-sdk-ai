package com.sdkwork.ai

data class OpenAiFileList(
    val data: List<OpenAiFileObject>? = null,
    val object: String? = null,
    val firstId: String? = null,
    val lastId: String? = null,
    val hasMore: Boolean? = null
)
