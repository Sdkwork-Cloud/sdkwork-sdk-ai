package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class VideosApi {
    private final HttpClient client;
    
    public VideosApi(HttpClient client) {
        this.client = client;
    }

    /** List videos */
    public OpenAiVideoList listVideos(Map<String, Object> params) throws Exception {
        return (OpenAiVideoList) client.get(ApiPaths.aiPath("/videos"), params);
    }

    /** Create video */
    public OpenAiVideo createVideo(VideoGenerationRequest body) throws Exception {
        return (OpenAiVideo) client.post(ApiPaths.aiPath("/videos"), body);
    }

    /** Retrieve video */
    public OpenAiVideo retrieveVideo(String video_id) throws Exception {
        return (OpenAiVideo) client.get(ApiPaths.aiPath("/videos/" + video_id + ""));
    }

    /** Delete video */
    public OpenAiVideoDeleteResponse deleteVideo(String video_id) throws Exception {
        return (OpenAiVideoDeleteResponse) client.delete(ApiPaths.aiPath("/videos/" + video_id + ""));
    }
}
