package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class I18nResourceApi {
    private final HttpClient client;
    
    public I18nResourceApi(HttpClient client) {
        this.client = client;
    }

    public PlusApiResultListLabelOption getOptions(Map<String, Object> params) throws Exception {
        return (PlusApiResultListLabelOption) client.get(ApiPaths.aiPath("/v1/open/i18n/options"), params);
    }

    public PlusApiResultListLabelOption createOptions(Map<String, Object> params) throws Exception {
        return (PlusApiResultListLabelOption) client.post(ApiPaths.aiPath("/v1/open/i18n/options"), null, params);
    }
}
