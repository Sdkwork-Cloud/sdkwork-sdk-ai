package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ImagesApi(private val client: HttpClient) {

    /** Create image variation */
    suspend fun createImageVariation(body: ImageGenerationRequest): ImageGenerationResponse? {
        return client.post(ApiPaths.aiPath("/images/variations"), body) as? ImageGenerationResponse
    }

    /** Create image */
    suspend fun createImage(body: ImageGenerationRequest): ImageGenerationResponse? {
        return client.post(ApiPaths.aiPath("/images/generations"), body) as? ImageGenerationResponse
    }

    /** Create image edit */
    suspend fun createImageEdit(body: ImageGenerationRequest): ImageGenerationResponse? {
        return client.post(ApiPaths.aiPath("/images/edits"), body) as? ImageGenerationResponse
    }
}
