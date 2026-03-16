package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class MusicApi(private val client: HttpClient) {

    /** Generate music */
    suspend fun createGenerate(body: MusicGenerationRequest): SunoMusic? {
        return client.post(ApiPaths.aiPath("/v1/music/generations"), body) as? SunoMusic
    }

    /** List music */
    suspend fun listMusic(params: Map<String, Any>? = null): SunoMusicList? {
        return client.get(ApiPaths.aiPath("/music"), params) as? SunoMusicList
    }

    /** Generate music */
    suspend fun createGenerateMusic(body: MusicGenerationRequest): SunoMusic? {
        return client.post(ApiPaths.aiPath("/music"), body) as? SunoMusic
    }

    /** Generate music */
    suspend fun createGenerateGenerations(body: MusicGenerationRequest): SunoMusic? {
        return client.post(ApiPaths.aiPath("/music/generations"), body) as? SunoMusic
    }

    /** Retrieve music */
    suspend fun retrieve(music_id: String): SunoMusic? {
        return client.get(ApiPaths.aiPath("/music/$music_id")) as? SunoMusic
    }

    /** Delete music */
    suspend fun deleteMusic(music_id: String): SunoMusicDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/music/$music_id")) as? SunoMusicDeleteResponse
    }
}
