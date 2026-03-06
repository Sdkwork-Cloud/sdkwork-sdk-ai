package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ResponsesApi(private val client: HttpClient) {

    /** Cancel response */
    suspend fun cancelResponse(response_id: String): CancelResponseResponse? {
        return client.post(ApiPaths.aiPath("/responses/$response_id/cancel"), null) as? CancelResponseResponse
    }

    /** Create response */
    suspend fun createResponse(body: CreateResponsePostRequest): CreateResponsePostResponse? {
        return client.post(ApiPaths.aiPath("/responses"), body) as? CreateResponsePostResponse
    }

    /** List response input items */
    suspend fun listResponseInputItems(response_id: String): ListResponseInputItemsGetResponse? {
        return client.get(ApiPaths.aiPath("/responses/$response_id/input_items")) as? ListResponseInputItemsGetResponse
    }

    /** Get response */
    suspend fun getResponse(response_id: String): GetResponseGetResponse? {
        return client.get(ApiPaths.aiPath("/responses/$response_id")) as? GetResponseGetResponse
    }

    /** Delete response */
    suspend fun deleteResponse(response_id: String): DeleteResponseDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/responses/$response_id")) as? DeleteResponseDeleteResponse
    }
}
