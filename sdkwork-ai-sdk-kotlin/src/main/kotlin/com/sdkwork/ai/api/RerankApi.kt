package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class RerankApi(private val client: HttpClient) {

    /** Rerank documents */
    suspend fun rerank(body: RerankRequest): RerankResponse? {
        return client.post(ApiPaths.aiPath("/rerank"), body) as? RerankResponse
    }
}
