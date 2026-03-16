package com.sdkwork.ai.api;

import com.sdkwork.ai.http.HttpClient;
import com.sdkwork.ai.model.*;
import java.util.List;
import java.util.Map;

public class ThreadApi {
    private final HttpClient client;
    
    public ThreadApi(HttpClient client) {
        this.client = client;
    }

    /** Submit tool outputs */
    public SubmitToolOutputsPostResponse submitToolOutputs(String thread_id, String run_id, SubmitToolOutputsPostRequest body) throws Exception {
        return (SubmitToolOutputsPostResponse) client.post(ApiPaths.aiPath("/threads/" + thread_id + "/runs/" + run_id + "/submit_tool_outputs"), body);
    }

    /** Cancel run */
    public RunResponse cancelRun(String thread_id, String run_id) throws Exception {
        return (RunResponse) client.post(ApiPaths.aiPath("/threads/" + thread_id + "/runs/" + run_id + "/cancel"), null);
    }

    /** Get run */
    public RunResponse getRun(String thread_id, String run_id) throws Exception {
        return (RunResponse) client.get(ApiPaths.aiPath("/threads/" + thread_id + "/runs/" + run_id + ""));
    }

    /** Modify run */
    public RunResponse updateRun(String thread_id, String run_id, UpdateRunRequest body) throws Exception {
        return (RunResponse) client.post(ApiPaths.aiPath("/threads/" + thread_id + "/runs/" + run_id + ""), body);
    }

    /** List runs */
    public RunListResponse listRuns(String thread_id, Map<String, Object> params) throws Exception {
        return (RunListResponse) client.get(ApiPaths.aiPath("/threads/" + thread_id + "/runs"), params);
    }

    /** Create run */
    public CreateRunPostResponse createRun(String thread_id, RunCreateRequest body) throws Exception {
        return (CreateRunPostResponse) client.post(ApiPaths.aiPath("/threads/" + thread_id + "/runs"), body);
    }

    /** Get thread message */
    public ThreadMessageResponse getThreadMessage(String thread_id, String message_id) throws Exception {
        return (ThreadMessageResponse) client.get(ApiPaths.aiPath("/threads/" + thread_id + "/messages/" + message_id + ""));
    }

    /** Modify thread message */
    public ThreadMessageResponse updateThreadMessage(String thread_id, String message_id, ThreadMessageModifyRequest body) throws Exception {
        return (ThreadMessageResponse) client.post(ApiPaths.aiPath("/threads/" + thread_id + "/messages/" + message_id + ""), body);
    }

    /** List thread messages */
    public ThreadMessageListResponse listThreadMessages(String thread_id, Map<String, Object> params) throws Exception {
        return (ThreadMessageListResponse) client.get(ApiPaths.aiPath("/threads/" + thread_id + "/messages"), params);
    }

    /** Create thread message */
    public ThreadMessageResponse createThreadMessage(String thread_id, ThreadMessageCreateRequest body) throws Exception {
        return (ThreadMessageResponse) client.post(ApiPaths.aiPath("/threads/" + thread_id + "/messages"), body);
    }

    /** Get thread */
    public ThreadResponse getThread(String thread_id) throws Exception {
        return (ThreadResponse) client.get(ApiPaths.aiPath("/threads/" + thread_id + ""));
    }

    /** Update thread */
    public ThreadResponse updateThread(String thread_id, ThreadCreateRequest body) throws Exception {
        return (ThreadResponse) client.post(ApiPaths.aiPath("/threads/" + thread_id + ""), body);
    }

    /** Delete thread */
    public ThreadDeleteResponse deleteThread(String thread_id) throws Exception {
        return (ThreadDeleteResponse) client.delete(ApiPaths.aiPath("/threads/" + thread_id + ""));
    }

    /** Create thread and run */
    public CreateThreadAndRunResponse createThreadAndRun(ThreadRunCreateRequest body) throws Exception {
        return (CreateThreadAndRunResponse) client.post(ApiPaths.aiPath("/threads/runs"), body);
    }

    /** Create thread */
    public ThreadResponse createThread(ThreadCreateRequest body) throws Exception {
        return (ThreadResponse) client.post(ApiPaths.aiPath("/threads"), body);
    }

    /** Get run step */
    public RunStepResponse getRunStep(String thread_id, String run_id, String step_id) throws Exception {
        return (RunStepResponse) client.get(ApiPaths.aiPath("/threads/" + thread_id + "/runs/" + run_id + "/steps/" + step_id + ""));
    }

    /** List run steps */
    public RunStepListResponse listRunSteps(String thread_id, String run_id, Map<String, Object> params) throws Exception {
        return (RunStepListResponse) client.get(ApiPaths.aiPath("/threads/" + thread_id + "/runs/" + run_id + "/steps"), params);
    }
}
