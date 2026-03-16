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
    public SunoMusic createGenerate(MusicGenerationRequest body) throws Exception {
        return (SunoMusic) client.post(ApiPaths.aiPath("/v1/music/generations"), body);
    }

    /** List music */
    public SunoMusicList listMusic(Map<String, Object> params) throws Exception {
        return (SunoMusicList) client.get(ApiPaths.aiPath("/music"), params);
    }

    /** Generate music */
    public SunoMusic createGenerateMusic(MusicGenerationRequest body) throws Exception {
        return (SunoMusic) client.post(ApiPaths.aiPath("/music"), body);
    }

    /** Generate music */
    public SunoMusic createGenerateGenerations(MusicGenerationRequest body) throws Exception {
        return (SunoMusic) client.post(ApiPaths.aiPath("/music/generations"), body);
    }

    /** Retrieve music */
    public SunoMusic retrieve(String music_id) throws Exception {
        return (SunoMusic) client.get(ApiPaths.aiPath("/music/" + music_id + ""));
    }

    /** Delete music */
    public SunoMusicDeleteResponse deleteMusic(String music_id) throws Exception {
        return (SunoMusicDeleteResponse) client.delete(ApiPaths.aiPath("/music/" + music_id + ""));
    }
}
