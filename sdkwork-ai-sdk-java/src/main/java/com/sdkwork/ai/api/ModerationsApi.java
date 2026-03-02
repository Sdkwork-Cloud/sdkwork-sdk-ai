package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class ModerationsApi {
    private final HttpClient client;
    
    public ModerationsApi(HttpClient client) {
        this.client = client;
    }

    /** Create moderation */
    public ModerationResponse createModeration(ModerationRequest body) throws Exception {
        return (ModerationResponse) client.post(ApiPaths.aiPath("/moderations"), body);
    }
}
