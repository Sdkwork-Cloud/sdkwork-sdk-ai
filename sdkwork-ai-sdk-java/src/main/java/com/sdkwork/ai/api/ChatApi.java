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
        return (ChatCompletionResponse) client.get(ApiPaths.aiPath("/chat/completions/" + completion_id + ""));
    }

    /** Update chat completion */
    public ChatCompletionResponse createUpdateCompletion(String completion_id, UpdateCompletionPostRequest body) throws Exception {
        return (ChatCompletionResponse) client.post(ApiPaths.aiPath("/chat/completions/" + completion_id + ""), body);
    }

    /** Delete chat completion */
    public ChatCompletionDeleteResponse deleteCompletion(String completion_id) throws Exception {
        return (ChatCompletionDeleteResponse) client.delete(ApiPaths.aiPath("/chat/completions/" + completion_id + ""));
    }

    /** Update chat completion */
    public ChatCompletionResponse patchUpdateCompletion(String completion_id, UpdateCompletionPatchRequest body) throws Exception {
        return (ChatCompletionResponse) client.patch(ApiPaths.aiPath("/v1/chat/completions/" + completion_id + ""), body);
    }

    /** Update chat completion */
    public ChatCompletionResponse patchUpdateCompletionChat(String completion_id, PatchUpdateCompletionRequest body) throws Exception {
        return (ChatCompletionResponse) client.patch(ApiPaths.aiPath("/chat/completions/" + completion_id + ""), body);
    }

    /** Get chat completion */
    public ChatCompletionResponse getChatCompletion(String completion_id) throws Exception {
        return (ChatCompletionResponse) client.get(ApiPaths.aiPath("/management/chat/completions/" + completion_id + ""));
    }

    /** Update chat completion */
    public ChatCompletionResponse updateChatCompletion(String completion_id, UpdateChatCompletionRequest body) throws Exception {
        return (ChatCompletionResponse) client.post(ApiPaths.aiPath("/management/chat/completions/" + completion_id + ""), body);
    }

    /** Delete chat completion */
    public ChatCompletionDeleteResponse deleteChatCompletion(String completion_id) throws Exception {
        return (ChatCompletionDeleteResponse) client.delete(ApiPaths.aiPath("/management/chat/completions/" + completion_id + ""));
    }

    /** List chat completions */
    public ChatCompletionList listCompletions(Map<String, Object> params) throws Exception {
        return (ChatCompletionList) client.get(ApiPaths.aiPath("/chat/completions"), params);
    }

    /** Create chat completion */
    public CreateChatCompletionResponse createChatCompletion(ChatCompletionRequest body) throws Exception {
        return (CreateChatCompletionResponse) client.post(ApiPaths.aiPath("/chat/completions"), body);
    }

    /** Get chat messages */
    public ChatMessageList getChatMessages(String completion_id, Map<String, Object> params) throws Exception {
        return (ChatMessageList) client.get(ApiPaths.aiPath("/management/chat/completions/" + completion_id + "/messages"), params);
    }

    /** List chat completions */
    public ChatCompletionList listChatCompletions(Map<String, Object> params) throws Exception {
        return (ChatCompletionList) client.get(ApiPaths.aiPath("/management/chat/completions"), params);
    }

    /** Get chat completion messages */
    public ChatMessageList getMessages(String completion_id, Map<String, Object> params) throws Exception {
        return (ChatMessageList) client.get(ApiPaths.aiPath("/chat/completions/" + completion_id + "/messages"), params);
    }
}
