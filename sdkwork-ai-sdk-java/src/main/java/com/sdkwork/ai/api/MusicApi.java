package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class MusicApi {
    private final HttpClient client;
    
    public MusicApi(HttpClient client) {
        this.client = client;
    }

    /** Generate music */
    public SunoMusic generate(MusicGenerationRequest body) throws Exception {
        return (SunoMusic) client.post(ApiPaths.aiPath("/music/generations"), body);
    }

    /** Retrieve music */
    public SunoMusic retrieve(String musicId) throws Exception {
        return (SunoMusic) client.get(ApiPaths.aiPath("/music/" + musicId + ""));
    }

    /** Delete music */
    public SunoMusicDeleteResponse deleteMusic(String musicId) throws Exception {
        return (SunoMusicDeleteResponse) client.delete(ApiPaths.aiPath("/music/" + musicId + ""));
    }

    /** List music */
    public SunoMusicList listMusic(Map<String, Object> params) throws Exception {
        return (SunoMusicList) client.get(ApiPaths.aiPath("/music"), params);
    }
}
