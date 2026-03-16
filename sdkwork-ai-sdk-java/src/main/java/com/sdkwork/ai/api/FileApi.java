package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class FileApi {
    private final HttpClient client;
    
    public FileApi(HttpClient client) {
        this.client = client;
    }

    /** List files */
    public OpenAiFileList listFiles(Map<String, Object> params) throws Exception {
        return (OpenAiFileList) client.get(ApiPaths.aiPath("/files"), params);
    }

    /** Upload file */
    public OpenAiFileObject upload(UploadFileRequest body, Map<String, Object> params) throws Exception {
        return (OpenAiFileObject) client.post(ApiPaths.aiPath("/files"), body, params, null, "multipart/form-data");
    }

    /** Retrieve file content */
    public String retrieveFileContent(String file_id) throws Exception {
        return (String) client.get(ApiPaths.aiPath("/files/" + file_id + "/content"));
    }

    /** Retrieve file */
    public OpenAiFileObject retrieve(String file_id) throws Exception {
        return (OpenAiFileObject) client.get(ApiPaths.aiPath("/files/" + file_id + ""));
    }

    /** Delete file */
    public OpenAiFileDeleteResponse deleteFile(String file_id) throws Exception {
        return (OpenAiFileDeleteResponse) client.delete(ApiPaths.aiPath("/files/" + file_id + ""));
    }
}
