package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class Models2Api(private val client: HttpClient) {

    /** Retrieve model */
    suspend fun retrieveModel(model: String): OpenAiModel? {
        return client.get(ApiPaths.aiPath("/v1/models/$model")) as? OpenAiModel
    }

    /** Delete model */
    suspend fun deleteModel(model: String): OpenAiModelDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/v1/models/$model")) as? OpenAiModelDeleteResponse
    }

    /** List models */
    suspend fun listModels(): OpenAiModelList? {
        return client.get(ApiPaths.aiPath("/v1/models")) as? OpenAiModelList
    }
}
