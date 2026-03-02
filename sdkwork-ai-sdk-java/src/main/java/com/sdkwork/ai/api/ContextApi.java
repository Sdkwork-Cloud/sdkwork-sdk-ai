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
    public ContextResponse chatWith(String contextId, ChatWithContextRequest body) throws Exception {
        return (ContextResponse) client.post(ApiPaths.aiPath("/context/" + contextId + "/chat/completions"), body);
    }

    /** Create context */
    public ContextResponse createContext(ContextCreateRequest body) throws Exception {
        return (ContextResponse) client.post(ApiPaths.aiPath("/context/create"), body);
    }

    /** Get context */
    public ContextResponse getContext(String contextId) throws Exception {
        return (ContextResponse) client.get(ApiPaths.aiPath("/context/" + contextId + ""));
    }

    /** Delete context */
    public Void deleteContext(String contextId) throws Exception {
        client.delete(ApiPaths.aiPath("/context/" + contextId + ""));
        return null;
    }
}
