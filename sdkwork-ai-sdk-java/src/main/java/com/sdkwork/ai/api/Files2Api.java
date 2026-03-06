package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class Files2Api {
    private final HttpClient client;
    
    public Files2Api(HttpClient client) {
        this.client = client;
    }

    /** List files */
    public OpenAiFileList listFiles(Map<String, Object> params) throws Exception {
        return (OpenAiFileList) client.get(ApiPaths.aiPath("/v1/files"), params);
    }

    /** Upload file */
    public OpenAiFileObject uploadFile(UploadFilePostRequest body, Map<String, Object> params) throws Exception {
        return (OpenAiFileObject) client.post(ApiPaths.aiPath("/v1/files"), body, params, null, "multipart/form-data");
    }

    /** Retrieve file content */
    public String retrieveFileContent(String fileId) throws Exception {
        return (String) client.get(ApiPaths.aiPath("/v1/files/" + fileId + "/content"));
    }

    /** Retrieve file */
    public OpenAiFileObject retrieveFile(String fileId) throws Exception {
        return (OpenAiFileObject) client.get(ApiPaths.aiPath("/v1/files/" + fileId + ""));
    }

    /** Delete file */
    public OpenAiFileDeleteResponse deleteFile(String fileId) throws Exception {
        return (OpenAiFileDeleteResponse) client.delete(ApiPaths.aiPath("/v1/files/" + fileId + ""));
    }
}
