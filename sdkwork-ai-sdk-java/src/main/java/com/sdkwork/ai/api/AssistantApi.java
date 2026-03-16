package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class AssistantApi {
    private final HttpClient client;
    
    public AssistantApi(HttpClient client) {
        this.client = client;
    }

    /** Get assistant */
    public AssistantResponse getAssistant(String assistant_id) throws Exception {
        return (AssistantResponse) client.get(ApiPaths.aiPath("/assistants/" + assistant_id + ""));
    }

    /** Update assistant */
    public AssistantResponse updateAssistant(String assistant_id, AssistantCreateRequest body) throws Exception {
        return (AssistantResponse) client.post(ApiPaths.aiPath("/assistants/" + assistant_id + ""), body);
    }

    /** Delete assistant */
    public AssistantDeleteResponse deleteAssistant(String assistant_id) throws Exception {
        return (AssistantDeleteResponse) client.delete(ApiPaths.aiPath("/assistants/" + assistant_id + ""));
    }

    /** List assistants */
    public AssistantListResponse listAssistants(Map<String, Object> params) throws Exception {
        return (AssistantListResponse) client.get(ApiPaths.aiPath("/assistants"), params);
    }

    /** Create assistant */
    public AssistantResponse createAssistant(AssistantCreateRequest body) throws Exception {
        return (AssistantResponse) client.post(ApiPaths.aiPath("/assistants"), body);
    }
}
