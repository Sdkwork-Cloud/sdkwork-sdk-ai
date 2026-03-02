package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class VideosApi(private val client: HttpClient) {

    /** List videos */
    suspend fun listVideos(params: Map<String, Any>? = null): OpenAiVideoList? {
        return client.get(ApiPaths.aiPath("/videos"), params) as? OpenAiVideoList
    }

    /** Create video */
    suspend fun createVideo(body: VideoGenerationRequest): OpenAiVideo? {
        return client.post(ApiPaths.aiPath("/videos"), body) as? OpenAiVideo
    }

    /** Retrieve video */
    suspend fun retrieveVideo(videoId: String): OpenAiVideo? {
        return client.get(ApiPaths.aiPath("/videos/$videoId")) as? OpenAiVideo
    }

    /** Delete video */
    suspend fun deleteVideo(videoId: String): OpenAiVideoDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/videos/$videoId")) as? OpenAiVideoDeleteResponse
    }
}
