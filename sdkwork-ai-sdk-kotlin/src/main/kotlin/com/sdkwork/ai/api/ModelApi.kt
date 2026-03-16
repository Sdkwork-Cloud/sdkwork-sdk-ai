package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class ModelApi(private val client: HttpClient) {

    /** Retrieve model */
    suspend fun retrieve(model: String): OpenAiModel? {
        return client.get(ApiPaths.aiPath("/models/$model")) as? OpenAiModel
    }

    /** Delete model */
    suspend fun deleteModel(model: String): OpenAiModelDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/models/$model")) as? OpenAiModelDeleteResponse
    }

    /** List models */
    suspend fun listModels(): OpenAiModelList? {
        return client.get(ApiPaths.aiPath("/models")) as? OpenAiModelList
    }
}
