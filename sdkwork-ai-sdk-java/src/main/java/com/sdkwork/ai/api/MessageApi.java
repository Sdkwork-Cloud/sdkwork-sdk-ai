package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class MessageApi {
    private final HttpClient client;
    
    public MessageApi(HttpClient client) {
        this.client = client;
    }

    /** Count Claude tokens */
    public CountClaudeTokensPostResponse countClaudeTokens(CountClaudeTokensPostRequest body) throws Exception {
        return (CountClaudeTokensPostResponse) client.post(ApiPaths.aiPath("/messages/count_tokens"), body);
    }

    /** Create Claude message */
    public CreateClaudeMessageResponse createClaude(CreateClaudeMessageRequest body, Map<String, String> headers) throws Exception {
        return (CreateClaudeMessageResponse) client.post(ApiPaths.aiPath("/messages"), body, null, headers);
    }
}
