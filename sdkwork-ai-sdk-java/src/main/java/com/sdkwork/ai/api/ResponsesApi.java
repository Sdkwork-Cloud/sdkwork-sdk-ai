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
    public CreateResponsePostResponse createResponse(CreateResponsePostRequest body) throws Exception {
        return (CreateResponsePostResponse) client.post(ApiPaths.aiPath("/responses"), body);
    }

    /** List response input items */
    public ListResponseInputItemsGetResponse listResponseInputItems(String response_id) throws Exception {
        return (ListResponseInputItemsGetResponse) client.get(ApiPaths.aiPath("/responses/" + response_id + "/input_items"));
    }

    /** Get response */
    public GetResponseGetResponse getResponse(String response_id) throws Exception {
        return (GetResponseGetResponse) client.get(ApiPaths.aiPath("/responses/" + response_id + ""));
    }

    /** Delete response */
    public DeleteResponseDeleteResponse deleteResponse(String response_id) throws Exception {
        return (DeleteResponseDeleteResponse) client.delete(ApiPaths.aiPath("/responses/" + response_id + ""));
    }
}
