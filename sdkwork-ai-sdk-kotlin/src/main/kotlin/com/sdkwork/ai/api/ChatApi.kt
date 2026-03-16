package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ChatApi(private val client: HttpClient) {

    /** Get chat completion */
    suspend fun getCompletion(completion_id: String): ChatCompletionResponse? {
        return client.get(ApiPaths.aiPath("/chat/completions/$completion_id")) as? ChatCompletionResponse
    }

    /** Update chat completion */
    suspend fun createUpdateCompletion(completion_id: String, body: UpdateCompletionPostRequest): ChatCompletionResponse? {
        return client.post(ApiPaths.aiPath("/chat/completions/$completion_id"), body) as? ChatCompletionResponse
    }

    /** Delete chat completion */
    suspend fun deleteCompletion(completion_id: String): ChatCompletionDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/chat/completions/$completion_id")) as? ChatCompletionDeleteResponse
    }

    /** Update chat completion */
    suspend fun patchUpdateCompletion(completion_id: String, body: UpdateCompletionPatchRequest): ChatCompletionResponse? {
        return client.patch(ApiPaths.aiPath("/v1/chat/completions/$completion_id"), body) as? ChatCompletionResponse
    }

    /** Update chat completion */
    suspend fun patchUpdateCompletionChat(completion_id: String, body: PatchUpdateCompletionRequest): ChatCompletionResponse? {
        return client.patch(ApiPaths.aiPath("/chat/completions/$completion_id"), body) as? ChatCompletionResponse
    }

    /** Get chat completion */
    suspend fun getChatCompletion(completion_id: String): ChatCompletionResponse? {
        return client.get(ApiPaths.aiPath("/management/chat/completions/$completion_id")) as? ChatCompletionResponse
    }

    /** Update chat completion */
    suspend fun updateChatCompletion(completion_id: String, body: UpdateChatCompletionRequest): ChatCompletionResponse? {
        return client.post(ApiPaths.aiPath("/management/chat/completions/$completion_id"), body) as? ChatCompletionResponse
    }

    /** Delete chat completion */
    suspend fun deleteChatCompletion(completion_id: String): ChatCompletionDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/management/chat/completions/$completion_id")) as? ChatCompletionDeleteResponse
    }

    /** List chat completions */
    suspend fun listCompletions(params: Map<String, Any>? = null): ChatCompletionList? {
        return client.get(ApiPaths.aiPath("/chat/completions"), params) as? ChatCompletionList
    }

    /** Create chat completion */
    suspend fun createChatCompletion(body: ChatCompletionRequest): CreateChatCompletionResponse? {
        return client.post(ApiPaths.aiPath("/chat/completions"), body) as? CreateChatCompletionResponse
    }

    /** Get chat messages */
    suspend fun getChatMessages(completion_id: String, params: Map<String, Any>? = null): ChatMessageList? {
        return client.get(ApiPaths.aiPath("/management/chat/completions/$completion_id/messages"), params) as? ChatMessageList
    }

    /** List chat completions */
    suspend fun listChatCompletions(params: Map<String, Any>? = null): ChatCompletionList? {
        return client.get(ApiPaths.aiPath("/management/chat/completions"), params) as? ChatCompletionList
    }

    /** Get chat completion messages */
    suspend fun getMessages(completion_id: String, params: Map<String, Any>? = null): ChatMessageList? {
        return client.get(ApiPaths.aiPath("/chat/completions/$completion_id/messages"), params) as? ChatMessageList
    }
}
