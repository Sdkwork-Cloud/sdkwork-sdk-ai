package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ChatCompletions2Api(private val client: HttpClient) {

    /** Get chat completion */
    suspend fun getChatCompletion(completionId: String): ChatCompletionResponse? {
        return client.get(ApiPaths.aiPath("/v1/management/chat/completions/$completionId")) as? ChatCompletionResponse
    }

    /** Update chat completion */
    suspend fun updateChatCompletion(completionId: String, body: UpdateChatCompletionPostRequest): ChatCompletionResponse? {
        return client.post(ApiPaths.aiPath("/v1/management/chat/completions/$completionId"), body) as? ChatCompletionResponse
    }

    /** Delete chat completion */
    suspend fun deleteChatCompletion(completionId: String): ChatCompletionDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/v1/management/chat/completions/$completionId")) as? ChatCompletionDeleteResponse
    }

    /** Get chat messages */
    suspend fun getChatMessages(completionId: String, params: Map<String, Any>? = null): ChatMessageList? {
        return client.get(ApiPaths.aiPath("/v1/management/chat/completions/$completionId/messages"), params) as? ChatMessageList
    }

    /** List chat completions */
    suspend fun listChatCompletions(params: Map<String, Any>? = null): ChatCompletionList? {
        return client.get(ApiPaths.aiPath("/v1/management/chat/completions"), params) as? ChatCompletionList
    }
}
