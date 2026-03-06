package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class MusicApi(private val client: HttpClient) {

    /** Generate music */
    suspend fun generate(body: MusicGenerationRequest): SunoMusic? {
        return client.post(ApiPaths.aiPath("/v1/music/generations"), body) as? SunoMusic
    }

    /** Retrieve music */
    suspend fun retrieve(musicId: String): SunoMusic? {
        return client.get(ApiPaths.aiPath("/v1/music/$musicId")) as? SunoMusic
    }

    /** Delete music */
    suspend fun deleteMusic(musicId: String): SunoMusicDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/v1/music/$musicId")) as? SunoMusicDeleteResponse
    }

    /** List music */
    suspend fun listMusic(params: Map<String, Any>? = null): SunoMusicList? {
        return client.get(ApiPaths.aiPath("/v1/music"), params) as? SunoMusicList
    }
}
