package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class Images2Api {
    private final HttpClient client;
    
    public Images2Api(HttpClient client) {
        this.client = client;
    }

    /** Create image variation */
    public ImageGenerationResponse createImageVariation(CreateImageVariationPostRequest body, Map<String, Object> params) throws Exception {
        return (ImageGenerationResponse) client.post(ApiPaths.aiPath("/v1/images/variations"), body, params, null, "multipart/form-data");
    }

    /** Create image */
    public ImageGenerationResponse createImage(ImageGenerationRequest body) throws Exception {
        return (ImageGenerationResponse) client.post(ApiPaths.aiPath("/v1/images/generations"), body);
    }

    /** Create image edit */
    public ImageGenerationResponse createImageEdit(CreateImageEditRequest body, Map<String, Object> params) throws Exception {
        return (ImageGenerationResponse) client.post(ApiPaths.aiPath("/v1/images/edits"), body, params, null, "multipart/form-data");
    }
}
