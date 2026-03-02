package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class BatchesApi {
    private final HttpClient client;
    
    public BatchesApi(HttpClient client) {
        this.client = client;
    }

    /** Cancel batch */
    public BatchResponse cancelBatch(String batch_id) throws Exception {
        return (BatchResponse) client.post(ApiPaths.aiPath("/batches/" + batch_id + "/cancel"), null);
    }

    /** List batches */
    public BatchListResponse listBatches(Map<String, Object> params) throws Exception {
        return (BatchListResponse) client.get(ApiPaths.aiPath("/batches"), params);
    }

    /** Create batch */
    public BatchResponse createBatch(BatchCreateRequest body) throws Exception {
        return (BatchResponse) client.post(ApiPaths.aiPath("/batches"), body);
    }

    /** Get batch */
    public BatchResponse getBatch(String batch_id) throws Exception {
        return (BatchResponse) client.get(ApiPaths.aiPath("/batches/" + batch_id + ""));
    }
}
