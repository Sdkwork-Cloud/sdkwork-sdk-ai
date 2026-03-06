package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class Models2Api {
    private final HttpClient client;
    
    public Models2Api(HttpClient client) {
        this.client = client;
    }

    /** Retrieve model */
    public OpenAiModel retrieveModel(String model) throws Exception {
        return (OpenAiModel) client.get(ApiPaths.aiPath("/v1/models/" + model + ""));
    }

    /** Delete model */
    public OpenAiModelDeleteResponse deleteModel(String model) throws Exception {
        return (OpenAiModelDeleteResponse) client.delete(ApiPaths.aiPath("/v1/models/" + model + ""));
    }

    /** List models */
    public OpenAiModelList listModels() throws Exception {
        return (OpenAiModelList) client.get(ApiPaths.aiPath("/v1/models"));
    }
}
