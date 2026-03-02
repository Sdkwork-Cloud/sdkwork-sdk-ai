package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class FilesApi {
    private final HttpClient client;
    
    public FilesApi(HttpClient client) {
        this.client = client;
    }

    /** List files */
    public OpenAiFileList listFiles(Map<String, Object> params) throws Exception {
        return (OpenAiFileList) client.get(ApiPaths.aiPath("/files"), params);
    }

    /** Upload file */
    public OpenAiFileObject uploadFile(UploadFileRequest body, Map<String, Object> params) throws Exception {
        return (OpenAiFileObject) client.post(ApiPaths.aiPath("/files"), body, params, null, "multipart/form-data");
    }

    /** Retrieve file content */
    public String retrieveFileContent(String fileId) throws Exception {
        return (String) client.get(ApiPaths.aiPath("/files/" + fileId + "/content"));
    }

    /** Retrieve file */
    public OpenAiFileObject retrieveFile(String fileId) throws Exception {
        return (OpenAiFileObject) client.get(ApiPaths.aiPath("/files/" + fileId + ""));
    }

    /** Delete file */
    public OpenAiFileDeleteResponse deleteFile(String fileId) throws Exception {
        return (OpenAiFileDeleteResponse) client.delete(ApiPaths.aiPath("/files/" + fileId + ""));
    }
}
