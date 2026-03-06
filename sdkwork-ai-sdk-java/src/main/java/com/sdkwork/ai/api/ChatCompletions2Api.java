package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class ChatCompletions2Api {
    private final HttpClient client;
    
    public ChatCompletions2Api(HttpClient client) {
        this.client = client;
    }

    /** Get chat completion */
    public ChatCompletionResponse getChatCompletion(String completionId) throws Exception {
        return (ChatCompletionResponse) client.get(ApiPaths.aiPath("/v1/management/chat/completions/" + completionId + ""));
    }

    /** Update chat completion */
    public ChatCompletionResponse updateChatCompletion(String completionId, UpdateChatCompletionPostRequest body) throws Exception {
        return (ChatCompletionResponse) client.post(ApiPaths.aiPath("/v1/management/chat/completions/" + completionId + ""), body);
    }

    /** Delete chat completion */
    public ChatCompletionDeleteResponse deleteChatCompletion(String completionId) throws Exception {
        return (ChatCompletionDeleteResponse) client.delete(ApiPaths.aiPath("/v1/management/chat/completions/" + completionId + ""));
    }

    /** Get chat messages */
    public ChatMessageList getChatMessages(String completionId, Map<String, Object> params) throws Exception {
        return (ChatMessageList) client.get(ApiPaths.aiPath("/v1/management/chat/completions/" + completionId + "/messages"), params);
    }

    /** List chat completions */
    public ChatCompletionList listChatCompletions(Map<String, Object> params) throws Exception {
        return (ChatCompletionList) client.get(ApiPaths.aiPath("/v1/management/chat/completions"), params);
    }
}
