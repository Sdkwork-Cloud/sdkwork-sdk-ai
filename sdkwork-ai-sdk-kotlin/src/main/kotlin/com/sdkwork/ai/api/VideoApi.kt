package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class VideoApi(private val client: HttpClient) {

    /** List videos */
    suspend fun listVideos(params: Map<String, Any>? = null): OpenAiVideoList? {
        return client.get(ApiPaths.aiPath("/videos"), params) as? OpenAiVideoList
    }

    /** Create video */
    suspend fun createVideo(body: VideoGenerationRequest): OpenAiVideo? {
        return client.post(ApiPaths.aiPath("/videos"), body) as? OpenAiVideo
    }

    /** Create video */
    suspend fun createVideoGenerations(body: VideoGenerationRequest): OpenAiVideo? {
        return client.post(ApiPaths.aiPath("/videos/generations"), body) as? OpenAiVideo
    }

    /** Create video */
    suspend fun createVideoGenerations2(body: VideoGenerationRequest): OpenAiVideo? {
        return client.post(ApiPaths.aiPath("/v1/videos/generations"), body) as? OpenAiVideo
    }

    /** Retrieve video */
    suspend fun retrieve(video_id: String): OpenAiVideo? {
        return client.get(ApiPaths.aiPath("/videos/$video_id")) as? OpenAiVideo
    }

    /** Delete video */
    suspend fun deleteVideo(video_id: String): OpenAiVideoDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/videos/$video_id")) as? OpenAiVideoDeleteResponse
    }
}
