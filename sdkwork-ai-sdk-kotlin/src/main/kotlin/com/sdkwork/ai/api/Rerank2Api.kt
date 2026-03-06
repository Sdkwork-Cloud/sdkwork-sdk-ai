package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class Rerank2Api(private val client: HttpClient) {

    /** Rerank documents */
    suspend fun rerank(body: RerankRequest): RerankResponse? {
        return client.post(ApiPaths.aiPath("/v1/rerank"), body) as? RerankResponse
    }
}
