package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ChatApi(private val client: HttpClient) {

    /** Get chat completion */
    suspend fun getCompletion(completion_id: String): ChatCompletionResponse? {
        return client.get(ApiPaths.aiPath("/chat/completions/$completion_id")) as? ChatCompletionResponse
    }

    /** Update chat completion */
    suspend fun updateCompletion(completion_id: String, body: UpdateCompletionRequest): ChatCompletionResponse? {
        return client.post(ApiPaths.aiPath("/chat/completions/$completion_id"), body) as? ChatCompletionResponse
    }

    /** Delete chat completion */
    suspend fun deleteCompletion(completion_id: String): ChatCompletionDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/chat/completions/$completion_id")) as? ChatCompletionDeleteResponse
    }

    /** Update chat completion */
    suspend fun patchUpdateCompletion(completion_id: String, body: PatchUpdateCompletionRequest): ChatCompletionResponse? {
        return client.patch(ApiPaths.aiPath("/chat/completions/$completion_id"), body) as? ChatCompletionResponse
    }

    /** Count Claude tokens */
    suspend fun countClaudeTokens(body: CountClaudeTokensRequest): CountClaudeTokensResponse? {
        return client.post(ApiPaths.aiPath("/messages/count_tokens"), body) as? CountClaudeTokensResponse
    }

    /** Create Claude message */
    suspend fun createClaudeMessage(body: CreateClaudeMessageRequest, headers: Map<String, String>? = null): CreateClaudeMessageResponse? {
        return client.post(ApiPaths.aiPath("/messages"), body, null, headers) as? CreateClaudeMessageResponse
    }

    /** List chat completions */
    suspend fun listCompletions(params: Map<String, Any>? = null): ChatCompletionList? {
        return client.get(ApiPaths.aiPath("/chat/completions"), params) as? ChatCompletionList
    }

    /** Create chat completion */
    suspend fun createChatCompletion(body: ChatCompletionRequest): CreateChatCompletionResponse? {
        return client.post(ApiPaths.aiPath("/chat/completions"), body) as? CreateChatCompletionResponse
    }

    /** Get chat completion messages */
    suspend fun getMessages(completion_id: String, params: Map<String, Any>? = null): ChatMessageList? {
        return client.get(ApiPaths.aiPath("/chat/completions/$completion_id/messages"), params) as? ChatMessageList
    }
}
