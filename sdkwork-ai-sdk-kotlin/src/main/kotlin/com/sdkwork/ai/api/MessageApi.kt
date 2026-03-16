package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class MessageApi(private val client: HttpClient) {

    /** Count Claude tokens */
    suspend fun countClaudeTokens(body: CountClaudeTokensPostRequest): CountClaudeTokensPostResponse? {
        return client.post(ApiPaths.aiPath("/messages/count_tokens"), body) as? CountClaudeTokensPostResponse
    }

    /** Create Claude message */
    suspend fun createClaude(body: CreateClaudeMessageRequest, headers: Map<String, String>? = null): CreateClaudeMessageResponse? {
        return client.post(ApiPaths.aiPath("/messages"), body, null, headers) as? CreateClaudeMessageResponse
    }
}
