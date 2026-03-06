package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ChatApi(private val client: HttpClient) {

    /** Get chat completion */
    suspend fun getCompletion(completion_id: String): ChatCompletionResponse? {
        return client.get(ApiPaths.aiPath("/v1/chat/completions/$completion_id")) as? ChatCompletionResponse
    }

    /** Update chat completion */
    suspend fun createUpdateCompletion(completion_id: String, body: UpdateCompletionRequest): ChatCompletionResponse? {
        return client.post(ApiPaths.aiPath("/v1/chat/completions/$completion_id"), body) as? ChatCompletionResponse
    }

    /** Delete chat completion */
    suspend fun deleteCompletion(completion_id: String): ChatCompletionDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/v1/chat/completions/$completion_id")) as? ChatCompletionDeleteResponse
    }

    /** Update chat completion */
    suspend fun patchUpdateCompletion(completion_id: String, body: UpdateCompletionPatchRequest): ChatCompletionResponse? {
        return client.patch(ApiPaths.aiPath("/v1/chat/completions/$completion_id"), body) as? ChatCompletionResponse
    }

    /** Count Claude tokens */
    suspend fun countClaudeTokens(body: CountClaudeTokensRequest): CountClaudeTokensResponse? {
        return client.post(ApiPaths.aiPath("/v1/messages/count_tokens"), body) as? CountClaudeTokensResponse
    }

    /** Create Claude message */
    suspend fun createClaudeMessage(body: CreateClaudeMessagePostRequest, headers: Map<String, String>? = null): CreateClaudeMessagePostResponse? {
        return client.post(ApiPaths.aiPath("/v1/messages"), body, null, headers) as? CreateClaudeMessagePostResponse
    }

    /** List chat completions */
    suspend fun listCompletions(params: Map<String, Any>? = null): ChatCompletionList? {
        return client.get(ApiPaths.aiPath("/v1/chat/completions"), params) as? ChatCompletionList
    }

    /** Create chat completion */
    suspend fun createChatCompletion(body: ChatCompletionRequest): CreateChatCompletionPostResponse? {
        return client.post(ApiPaths.aiPath("/v1/chat/completions"), body) as? CreateChatCompletionPostResponse
    }

    /** Get chat completion messages */
    suspend fun getMessages(completion_id: String, params: Map<String, Any>? = null): ChatMessageList? {
        return client.get(ApiPaths.aiPath("/v1/chat/completions/$completion_id/messages"), params) as? ChatMessageList
    }
}
