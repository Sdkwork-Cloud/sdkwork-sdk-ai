package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class Context2Api(private val client: HttpClient) {

    /** Chat with context */
    suspend fun chatWith(contextId: String, body: ChatWithContextPostRequest): ContextResponse? {
        return client.post(ApiPaths.aiPath("/v1/context/$contextId/chat/completions"), body) as? ContextResponse
    }

    /** Create context */
    suspend fun createContext(body: ContextCreateRequest): ContextResponse? {
        return client.post(ApiPaths.aiPath("/v1/context/create"), body) as? ContextResponse
    }

    /** Get context */
    suspend fun getContext(contextId: String): ContextResponse? {
        return client.get(ApiPaths.aiPath("/v1/context/$contextId")) as? ContextResponse
    }

    /** Delete context */
    suspend fun deleteContext(contextId: String): Unit {
        client.delete(ApiPaths.aiPath("/v1/context/$contextId"))
    }
}
