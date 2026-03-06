package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class Context2Api {
    private final HttpClient client;
    
    public Context2Api(HttpClient client) {
        this.client = client;
    }

    /** Chat with context */
    public ContextResponse chatWith(String contextId, ChatWithContextPostRequest body) throws Exception {
        return (ContextResponse) client.post(ApiPaths.aiPath("/v1/context/" + contextId + "/chat/completions"), body);
    }

    /** Create context */
    public ContextResponse createContext(ContextCreateRequest body) throws Exception {
        return (ContextResponse) client.post(ApiPaths.aiPath("/v1/context/create"), body);
    }

    /** Get context */
    public ContextResponse getContext(String contextId) throws Exception {
        return (ContextResponse) client.get(ApiPaths.aiPath("/v1/context/" + contextId + ""));
    }

    /** Delete context */
    public Void deleteContext(String contextId) throws Exception {
        client.delete(ApiPaths.aiPath("/v1/context/" + contextId + ""));
        return null;
    }
}
