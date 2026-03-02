package com.sdkwork.ai

data class ChunkConfig(
    val separator: String? = null,
    val chunkSize: Int? = null,
    val chunkOverlap: Int? = null
)
