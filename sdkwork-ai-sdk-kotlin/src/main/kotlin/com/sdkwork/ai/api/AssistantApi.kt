package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class AssistantApi(private val client: HttpClient) {

    /** Get assistant */
    suspend fun getAssistant(assistant_id: String): AssistantResponse? {
        return client.get(ApiPaths.aiPath("/assistants/$assistant_id")) as? AssistantResponse
    }

    /** Update assistant */
    suspend fun updateAssistant(assistant_id: String, body: AssistantCreateRequest): AssistantResponse? {
        return client.post(ApiPaths.aiPath("/assistants/$assistant_id"), body) as? AssistantResponse
    }

    /** Delete assistant */
    suspend fun deleteAssistant(assistant_id: String): AssistantDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/assistants/$assistant_id")) as? AssistantDeleteResponse
    }

    /** List assistants */
    suspend fun listAssistants(params: Map<String, Any>? = null): AssistantListResponse? {
        return client.get(ApiPaths.aiPath("/assistants"), params) as? AssistantListResponse
    }

    /** Create assistant */
    suspend fun createAssistant(body: AssistantCreateRequest): AssistantResponse? {
        return client.post(ApiPaths.aiPath("/assistants"), body) as? AssistantResponse
    }
}
