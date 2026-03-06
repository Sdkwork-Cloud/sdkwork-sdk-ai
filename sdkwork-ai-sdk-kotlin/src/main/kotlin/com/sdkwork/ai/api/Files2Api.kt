package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class Files2Api(private val client: HttpClient) {

    /** List files */
    suspend fun listFiles(params: Map<String, Any>? = null): OpenAiFileList? {
        return client.get(ApiPaths.aiPath("/v1/files"), params) as? OpenAiFileList
    }

    /** Upload file */
    suspend fun uploadFile(body: UploadFilePostRequest? = null, params: Map<String, Any>? = null): OpenAiFileObject? {
        return client.post(ApiPaths.aiPath("/v1/files"), body, params, null, "multipart/form-data") as? OpenAiFileObject
    }

    /** Retrieve file content */
    suspend fun retrieveFileContent(fileId: String): String? {
        return client.get(ApiPaths.aiPath("/v1/files/$fileId/content")) as? String
    }

    /** Retrieve file */
    suspend fun retrieveFile(fileId: String): OpenAiFileObject? {
        return client.get(ApiPaths.aiPath("/v1/files/$fileId")) as? OpenAiFileObject
    }

    /** Delete file */
    suspend fun deleteFile(fileId: String): OpenAiFileDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/v1/files/$fileId")) as? OpenAiFileDeleteResponse
    }
}
