package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ModerationsApi(private val client: HttpClient) {

    /** Create moderation */
    suspend fun createModeration(body: ModerationRequest): ModerationResponse? {
        return client.post(ApiPaths.aiPath("/moderations"), body) as? ModerationResponse
    }
}
