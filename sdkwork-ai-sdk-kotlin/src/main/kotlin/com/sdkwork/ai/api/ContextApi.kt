package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ContextApi(private val client: HttpClient) {

    /** Chat with context */
    suspend fun chatWith(contextId: String, body: ChatWithContextRequest): ContextResponse? {
        return client.post(ApiPaths.aiPath("/context/$contextId/chat/completions"), body) as? ContextResponse
    }

    /** Create context */
    suspend fun createContext(body: ContextCreateRequest): ContextResponse? {
        return client.post(ApiPaths.aiPath("/context/create"), body) as? ContextResponse
    }

    /** Get context */
    suspend fun getContext(contextId: String): ContextResponse? {
        return client.get(ApiPaths.aiPath("/context/$contextId")) as? ContextResponse
    }

    /** Delete context */
    suspend fun deleteContext(contextId: String): Unit {
        client.delete(ApiPaths.aiPath("/context/$contextId"))
    }
}
