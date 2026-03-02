package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class EmbeddingsApi {
    private final HttpClient client;
    
    public EmbeddingsApi(HttpClient client) {
        this.client = client;
    }

    /** Create embeddings */
    public EmbeddingResponse createEmbedding(EmbeddingRequest body) throws Exception {
        return (EmbeddingResponse) client.post(ApiPaths.aiPath("/embeddings"), body);
    }
}
