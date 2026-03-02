package com.sdkwork.ai

data class RerankRequest(
    val query: String? = null,
    val documents: List<Document>? = null,
    val model: String? = null,
    val topN: Int? = null,
    val returnDocuments: Boolean? = null
)
