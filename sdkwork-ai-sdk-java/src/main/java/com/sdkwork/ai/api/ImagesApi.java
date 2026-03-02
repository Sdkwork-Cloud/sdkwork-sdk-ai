package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class ImagesApi {
    private final HttpClient client;
    
    public ImagesApi(HttpClient client) {
        this.client = client;
    }

    /** Create image variation */
    public ImageGenerationResponse createImageVariation(ImageGenerationRequest body) throws Exception {
        return (ImageGenerationResponse) client.post(ApiPaths.aiPath("/images/variations"), body);
    }

    /** Create image */
    public ImageGenerationResponse createImage(ImageGenerationRequest body) throws Exception {
        return (ImageGenerationResponse) client.post(ApiPaths.aiPath("/images/generations"), body);
    }

    /** Create image edit */
    public ImageGenerationResponse createImageEdit(ImageGenerationRequest body) throws Exception {
        return (ImageGenerationResponse) client.post(ApiPaths.aiPath("/images/edits"), body);
    }
}
