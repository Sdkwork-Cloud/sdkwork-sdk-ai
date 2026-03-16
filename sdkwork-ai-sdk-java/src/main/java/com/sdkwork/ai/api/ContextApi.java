package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class ContextApi {
    private final HttpClient client;
    
    public ContextApi(HttpClient client) {
        this.client = client;
    }

    /** Chat with context */
    public ContextResponse chatWith(String context_id, ChatWithContextRequest body) throws Exception {
        return (ContextResponse) client.post(ApiPaths.aiPath("/context/" + context_id + "/chat/completions"), body);
    }

    /** Create context */
    public ContextResponse createContext(ContextCreateRequest body) throws Exception {
        return (ContextResponse) client.post(ApiPaths.aiPath("/context/create"), body);
    }

    /** Get context */
    public ContextResponse getContext(String context_id) throws Exception {
        return (ContextResponse) client.get(ApiPaths.aiPath("/context/" + context_id + ""));
    }

    /** Delete context */
    public Void deleteContext(String context_id) throws Exception {
        client.delete(ApiPaths.aiPath("/context/" + context_id + ""));
        return null;
    }
}
