package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class ResponsesApi {
    private final HttpClient client;
    
    public ResponsesApi(HttpClient client) {
        this.client = client;
    }

    /** Cancel response */
    public CancelResponseResponse cancelResponse(String response_id) throws Exception {
        return (CancelResponseResponse) client.post(ApiPaths.aiPath("/responses/" + response_id + "/cancel"), null);
    }

    /** Create response */
    public CreateResponseResponse createResponse(CreateResponseRequest body) throws Exception {
        return (CreateResponseResponse) client.post(ApiPaths.aiPath("/responses"), body);
    }

    /** List response input items */
    public ListResponseInputItemsResponse listResponseInputItems(String response_id) throws Exception {
        return (ListResponseInputItemsResponse) client.get(ApiPaths.aiPath("/responses/" + response_id + "/input_items"));
    }

    /** Get response */
    public GetResponseResponse getResponse(String response_id) throws Exception {
        return (GetResponseResponse) client.get(ApiPaths.aiPath("/responses/" + response_id + ""));
    }

    /** Delete response */
    public DeleteResponseResponse deleteResponse(String response_id) throws Exception {
        return (DeleteResponseResponse) client.delete(ApiPaths.aiPath("/responses/" + response_id + ""));
    }
}
