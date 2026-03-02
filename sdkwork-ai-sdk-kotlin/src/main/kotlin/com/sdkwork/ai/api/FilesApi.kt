package com.sdkwork.ai.api

import com.sdkwork.ai.*
import com.sdkwork.ai.http.HttpClient

class FilesApi(private val client: HttpClient) {

    /** List files */
    suspend fun listFiles(params: Map<String, Any>? = null): OpenAiFileList? {
        return client.get(ApiPaths.aiPath("/files"), params) as? OpenAiFileList
    }

    /** Upload file */
    suspend fun uploadFile(body: UploadFileRequest? = null, params: Map<String, Any>? = null): OpenAiFileObject? {
        return client.post(ApiPaths.aiPath("/files"), body, params, null, "multipart/form-data") as? OpenAiFileObject
    }

    /** Retrieve file content */
    suspend fun retrieveFileContent(fileId: String): String? {
        return client.get(ApiPaths.aiPath("/files/$fileId/content")) as? String
    }

    /** Retrieve file */
    suspend fun retrieveFile(fileId: String): OpenAiFileObject? {
        return client.get(ApiPaths.aiPath("/files/$fileId")) as? OpenAiFileObject
    }

    /** Delete file */
    suspend fun deleteFile(fileId: String): OpenAiFileDeleteResponse? {
        return client.delete(ApiPaths.aiPath("/files/$fileId")) as? OpenAiFileDeleteResponse
    }
}
