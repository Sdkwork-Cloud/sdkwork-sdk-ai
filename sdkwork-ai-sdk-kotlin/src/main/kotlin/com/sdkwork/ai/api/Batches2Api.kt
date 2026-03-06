package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class Batches2Api(private val client: HttpClient) {

    /** Cancel batch */
    suspend fun cancelBatch(batch_id: String): BatchResponse? {
        return client.post(ApiPaths.aiPath("/v1/batches/$batch_id/cancel"), null) as? BatchResponse
    }

    /** List batches */
    suspend fun listBatches(params: Map<String, Any>? = null): BatchListResponse? {
        return client.get(ApiPaths.aiPath("/v1/batches"), params) as? BatchListResponse
    }

    /** Create batch */
    suspend fun createBatch(body: BatchCreateRequest): BatchResponse? {
        return client.post(ApiPaths.aiPath("/v1/batches"), body) as? BatchResponse
    }

    /** Get batch */
    suspend fun getBatch(batch_id: String): BatchResponse? {
        return client.get(ApiPaths.aiPath("/v1/batches/$batch_id")) as? BatchResponse
    }
}
