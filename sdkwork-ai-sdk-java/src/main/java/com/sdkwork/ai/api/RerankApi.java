package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class RerankApi {
    private final HttpClient client;
    
    public RerankApi(HttpClient client) {
        this.client = client;
    }

    /** Rerank documents */
    public RerankResponse rerank(RerankRequest body) throws Exception {
        return (RerankResponse) client.post(ApiPaths.aiPath("/rerank"), body);
    }
}
