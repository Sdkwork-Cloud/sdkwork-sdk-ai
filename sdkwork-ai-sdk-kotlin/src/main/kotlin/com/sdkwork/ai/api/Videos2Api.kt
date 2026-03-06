package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class Videos2Api(private val client: HttpClient) {

    /** List videos */
    suspend fun listVideos(params: Map<String, Any>? = null): OpenAiVideoList? {
        return client.get(ApiPaths.aiPath("/v1/videos"), params) as? OpenAiVideoList
    }

    /** Create video */
    suspend fun createVideo(body: VideoGenerationRequest): OpenAiVideo? {
        return client.post(ApiPaths.aiPath("/v1/videos"), body) as? OpenAiVideo
    }

    /** Retrieve video */
    suspend fun retrieveVideo(video_id: String): OpenAiVideo? {
        return client.get(ApiPaths.aiPath("/v1/videos/$video_id")) as? OpenAiVideo
    }

    /** Delete video */
    suspend fun deleteVideo(video_id: String): OpenAiVideoDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/v1/videos/$video_id")) as? OpenAiVideoDeleteResponse
    }
}
