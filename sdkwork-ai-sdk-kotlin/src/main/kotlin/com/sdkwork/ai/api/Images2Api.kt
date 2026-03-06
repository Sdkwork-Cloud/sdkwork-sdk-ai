package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class Images2Api(private val client: HttpClient) {

    /** Create image variation */
    suspend fun createImageVariation(body: CreateImageVariationPostRequest? = null, params: Map<String, Any>? = null): ImageGenerationResponse? {
        return client.post(ApiPaths.aiPath("/v1/images/variations"), body, params, null, "multipart/form-data") as? ImageGenerationResponse
    }

    /** Create image */
    suspend fun createImage(body: ImageGenerationRequest): ImageGenerationResponse? {
        return client.post(ApiPaths.aiPath("/v1/images/generations"), body) as? ImageGenerationResponse
    }

    /** Create image edit */
    suspend fun createImageEdit(body: CreateImageEditRequest? = null, params: Map<String, Any>? = null): ImageGenerationResponse? {
        return client.post(ApiPaths.aiPath("/v1/images/edits"), body, params, null, "multipart/form-data") as? ImageGenerationResponse
    }
}
