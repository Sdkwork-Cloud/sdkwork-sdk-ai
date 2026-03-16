package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class FileApi(private val client: HttpClient) {

    /** List files */
    suspend fun listFiles(params: Map<String, Any>? = null): OpenAiFileList? {
        return client.get(ApiPaths.aiPath("/files"), params) as? OpenAiFileList
    }

    /** Upload file */
    suspend fun upload(body: UploadFileRequest? = null, params: Map<String, Any>? = null): OpenAiFileObject? {
        return client.post(ApiPaths.aiPath("/files"), body, params, null, "multipart/form-data") as? OpenAiFileObject
    }

    /** Retrieve file content */
    suspend fun retrieveFileContent(file_id: String): String? {
        return client.get(ApiPaths.aiPath("/files/$file_id/content")) as? String
    }

    /** Retrieve file */
    suspend fun retrieve(file_id: String): OpenAiFileObject? {
        return client.get(ApiPaths.aiPath("/files/$file_id")) as? OpenAiFileObject
    }

    /** Delete file */
    suspend fun deleteFile(file_id: String): OpenAiFileDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/files/$file_id")) as? OpenAiFileDeleteResponse
    }
}
