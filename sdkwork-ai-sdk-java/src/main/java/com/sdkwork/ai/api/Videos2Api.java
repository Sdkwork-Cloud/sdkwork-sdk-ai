package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class Videos2Api {
    private final HttpClient client;
    
    public Videos2Api(HttpClient client) {
        this.client = client;
    }

    /** List videos */
    public OpenAiVideoList listVideos(Map<String, Object> params) throws Exception {
        return (OpenAiVideoList) client.get(ApiPaths.aiPath("/v1/videos"), params);
    }

    /** Create video */
    public OpenAiVideo createVideo(VideoGenerationRequest body) throws Exception {
        return (OpenAiVideo) client.post(ApiPaths.aiPath("/v1/videos"), body);
    }

    /** Retrieve video */
    public OpenAiVideo retrieveVideo(String video_id) throws Exception {
        return (OpenAiVideo) client.get(ApiPaths.aiPath("/v1/videos/" + video_id + ""));
    }

    /** Delete video */
    public OpenAiVideoDeleteResponse deleteVideo(String video_id) throws Exception {
        return (OpenAiVideoDeleteResponse) client.delete(ApiPaths.aiPath("/v1/videos/" + video_id + ""));
    }
}
