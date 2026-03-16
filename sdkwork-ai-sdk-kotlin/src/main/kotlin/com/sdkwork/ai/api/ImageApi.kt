package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ImageApi(private val client: HttpClient) {

    /** Create image variation */
    suspend fun createImageVariation(body: CreateImageVariationRequest? = null, params: Map<String, Any>? = null): ImageGenerationResponse? {
        return client.post(ApiPaths.aiPath("/images/variations"), body, params, null, "multipart/form-data") as? ImageGenerationResponse
    }

    /** Create image */
    suspend fun createImage(body: ImageGenerationRequest): ImageGenerationResponse? {
        return client.post(ApiPaths.aiPath("/images"), body) as? ImageGenerationResponse
    }

    /** Create image */
    suspend fun createImageGenerations(body: ImageGenerationRequest): ImageGenerationResponse? {
        return client.post(ApiPaths.aiPath("/images/generations"), body) as? ImageGenerationResponse
    }

    /** Create image edit */
    suspend fun createImageEdit(body: CreateImageEditPostRequest? = null, params: Map<String, Any>? = null): ImageGenerationResponse? {
        return client.post(ApiPaths.aiPath("/images/edits"), body, params, null, "multipart/form-data") as? ImageGenerationResponse
    }
}
