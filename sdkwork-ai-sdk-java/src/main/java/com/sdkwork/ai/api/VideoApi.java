package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class VideoApi {
    private final HttpClient client;
    
    public VideoApi(HttpClient client) {
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

    /** Create video */
    public OpenAiVideo createVideoGenerations(VideoGenerationRequest body) throws Exception {
        return (OpenAiVideo) client.post(ApiPaths.aiPath("/videos/generations"), body);
    }

    /** Create video */
    public OpenAiVideo createVideoGenerations2(VideoGenerationRequest body) throws Exception {
        return (OpenAiVideo) client.post(ApiPaths.aiPath("/v1/videos/generations"), body);
    }

    /** Retrieve video */
    public OpenAiVideo retrieve(String video_id) throws Exception {
        return (OpenAiVideo) client.get(ApiPaths.aiPath("/videos/" + video_id + ""));
    }

    /** Delete video */
    public OpenAiVideoDeleteResponse deleteVideo(String video_id) throws Exception {
        return (OpenAiVideoDeleteResponse) client.delete(ApiPaths.aiPath("/videos/" + video_id + ""));
    }
}
