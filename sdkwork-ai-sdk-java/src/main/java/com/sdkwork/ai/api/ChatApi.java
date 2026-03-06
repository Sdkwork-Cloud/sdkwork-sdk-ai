package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class ChatApi {
    private final HttpClient client;
    
    public ChatApi(HttpClient client) {
        this.client = client;
    }

    /** Get chat completion */
    public ChatCompletionResponse getCompletion(String completion_id) throws Exception {
        return (ChatCompletionResponse) client.get(ApiPaths.aiPath("/v1/chat/completions/" + completion_id + ""));
    }

    /** Update chat completion */
    public ChatCompletionResponse createUpdateCompletion(String completion_id, UpdateCompletionRequest body) throws Exception {
        return (ChatCompletionResponse) client.post(ApiPaths.aiPath("/v1/chat/completions/" + completion_id + ""), body);
    }

    /** Delete chat completion */
    public ChatCompletionDeleteResponse deleteCompletion(String completion_id) throws Exception {
        return (ChatCompletionDeleteResponse) client.delete(ApiPaths.aiPath("/v1/chat/completions/" + completion_id + ""));
    }

    /** Update chat completion */
    public ChatCompletionResponse patchUpdateCompletion(String completion_id, UpdateCompletionPatchRequest body) throws Exception {
        return (ChatCompletionResponse) client.patch(ApiPaths.aiPath("/v1/chat/completions/" + completion_id + ""), body);
    }

    /** Count Claude tokens */
    public CountClaudeTokensResponse countClaudeTokens(CountClaudeTokensRequest body) throws Exception {
        return (CountClaudeTokensResponse) client.post(ApiPaths.aiPath("/v1/messages/count_tokens"), body);
    }

    /** Create Claude message */
    public CreateClaudeMessagePostResponse createClaudeMessage(CreateClaudeMessagePostRequest body, Map<String, String> headers) throws Exception {
        return (CreateClaudeMessagePostResponse) client.post(ApiPaths.aiPath("/v1/messages"), body, null, headers);
    }

    /** List chat completions */
    public ChatCompletionList listCompletions(Map<String, Object> params) throws Exception {
        return (ChatCompletionList) client.get(ApiPaths.aiPath("/v1/chat/completions"), params);
    }

    /** Create chat completion */
    public CreateChatCompletionPostResponse createChatCompletion(ChatCompletionRequest body) throws Exception {
        return (CreateChatCompletionPostResponse) client.post(ApiPaths.aiPath("/v1/chat/completions"), body);
    }

    /** Get chat completion messages */
    public ChatMessageList getMessages(String completion_id, Map<String, Object> params) throws Exception {
        return (ChatMessageList) client.get(ApiPaths.aiPath("/v1/chat/completions/" + completion_id + "/messages"), params);
    }
}
