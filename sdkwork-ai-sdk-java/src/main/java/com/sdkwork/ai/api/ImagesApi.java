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
    public ImageGenerationResponse createImageVariation(CreateImageVariationRequest body, Map<String, Object> params) throws Exception {
        return (ImageGenerationResponse) client.post(ApiPaths.aiPath("/images/variations"), body, params, null, "multipart/form-data");
    }

    /** Create image */
    public ImageGenerationResponse createImage(ImageGenerationRequest body) throws Exception {
        return (ImageGenerationResponse) client.post(ApiPaths.aiPath("/images/generations"), body);
    }

    /** Create image edit */
    public ImageGenerationResponse createImageEdit(CreateImageEditPostRequest body, Map<String, Object> params) throws Exception {
        return (ImageGenerationResponse) client.post(ApiPaths.aiPath("/images/edits"), body, params, null, "multipart/form-data");
    }
}
