package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class Audio2Api(private val client: HttpClient) {

    /** Create translation */
    suspend fun createTranslation(body: CreateTranslationPostRequest? = null, params: Map<String, Any>? = null): TranscriptionResponse? {
        return client.post(ApiPaths.aiPath("/v1/audio/translations"), body, params, null, "multipart/form-data") as? TranscriptionResponse
    }

    /** Create transcription */
    suspend fun createTranscription(body: CreateTranscriptionRequest? = null, params: Map<String, Any>? = null): TranscriptionResponse? {
        return client.post(ApiPaths.aiPath("/v1/audio/transcriptions"), body, params, null, "multipart/form-data") as? TranscriptionResponse
    }

    /** Create speech */
    suspend fun createSpeech(body: SpeechRequest): String? {
        return client.post(ApiPaths.aiPath("/v1/audio/speech"), body) as? String
    }
}
