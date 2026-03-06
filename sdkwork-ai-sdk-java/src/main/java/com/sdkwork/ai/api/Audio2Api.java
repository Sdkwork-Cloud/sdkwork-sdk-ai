package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class Audio2Api {
    private final HttpClient client;
    
    public Audio2Api(HttpClient client) {
        this.client = client;
    }

    /** Create translation */
    public TranscriptionResponse createTranslation(CreateTranslationPostRequest body, Map<String, Object> params) throws Exception {
        return (TranscriptionResponse) client.post(ApiPaths.aiPath("/v1/audio/translations"), body, params, null, "multipart/form-data");
    }

    /** Create transcription */
    public TranscriptionResponse createTranscription(CreateTranscriptionRequest body, Map<String, Object> params) throws Exception {
        return (TranscriptionResponse) client.post(ApiPaths.aiPath("/v1/audio/transcriptions"), body, params, null, "multipart/form-data");
    }

    /** Create speech */
    public String createSpeech(SpeechRequest body) throws Exception {
        return (String) client.post(ApiPaths.aiPath("/v1/audio/speech"), body);
    }
}
