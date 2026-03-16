package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ContextApi(private val client: HttpClient) {

    /** Chat with context */
    suspend fun chatWith(context_id: String, body: ChatWithContextRequest): ContextResponse? {
        return client.post(ApiPaths.aiPath("/context/$context_id/chat/completions"), body) as? ContextResponse
    }

    /** Create context */
    suspend fun createContext(body: ContextCreateRequest): ContextResponse? {
        return client.post(ApiPaths.aiPath("/context/create"), body) as? ContextResponse
    }

    /** Get context */
    suspend fun getContext(context_id: String): ContextResponse? {
        return client.get(ApiPaths.aiPath("/context/$context_id")) as? ContextResponse
    }

    /** Delete context */
    suspend fun deleteContext(context_id: String): Unit {
        client.delete(ApiPaths.aiPath("/context/$context_id"))
    }
}
