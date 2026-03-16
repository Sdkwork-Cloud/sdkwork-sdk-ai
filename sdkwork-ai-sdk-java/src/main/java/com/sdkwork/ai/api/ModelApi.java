package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class ModelApi {
    private final HttpClient client;
    
    public ModelApi(HttpClient client) {
        this.client = client;
    }

    /** Retrieve model */
    public OpenAiModel retrieve(String model) throws Exception {
        return (OpenAiModel) client.get(ApiPaths.aiPath("/models/" + model + ""));
    }

    /** Delete model */
    public OpenAiModelDeleteResponse deleteModel(String model) throws Exception {
        return (OpenAiModelDeleteResponse) client.delete(ApiPaths.aiPath("/models/" + model + ""));
    }

    /** List models */
    public OpenAiModelList listModels() throws Exception {
        return (OpenAiModelList) client.get(ApiPaths.aiPath("/models"));
    }
}
