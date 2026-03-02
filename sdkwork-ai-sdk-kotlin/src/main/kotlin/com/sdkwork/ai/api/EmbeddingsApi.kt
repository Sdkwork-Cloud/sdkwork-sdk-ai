package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class EmbeddingsApi(private val client: HttpClient) {

    /** Create embeddings */
    suspend fun createEmbedding(body: EmbeddingRequest): EmbeddingResponse? {
        return client.post(ApiPaths.aiPath("/embeddings"), body) as? EmbeddingResponse
    }
}
