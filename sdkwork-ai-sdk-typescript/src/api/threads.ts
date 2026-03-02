import { aiApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { CreateRunResponse, CreateThreadAndRunResponse, RunCreateRequest, RunListResponse, RunResponse, RunStepListResponse, RunStepResponse, SubmitToolOutputsRequest, SubmitToolOutputsResponse, ThreadCreateRequest, ThreadDeleteResponse, ThreadMessageCreateRequest, ThreadMessageListResponse, ThreadMessageModifyRequest, ThreadMessageResponse, ThreadResponse, ThreadRunCreateRequest, UpdateRunRequest } from '../types';


export class ThreadsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Submit tool outputs */
  async submitToolOutputs(thread_id: string | number, run_id: string | number, body: SubmitToolOutputsRequest): Promise<SubmitToolOutputsResponse> {
    return this.client.post<SubmitToolOutputsResponse>(aiApiPath(`/threads/${thread_id}/runs/${run_id}/submit_tool_outputs`), body);
  }

/** Cancel run */
  async cancelRun(thread_id: string | number, run_id: string | number): Promise<RunResponse> {
    return this.client.post<RunResponse>(aiApiPath(`/threads/${thread_id}/runs/${run_id}/cancel`));
  }

/** Get run */
  async getRun(thread_id: string | number, run_id: string | number): Promise<RunResponse> {
    return this.client.get<RunResponse>(aiApiPath(`/threads/${thread_id}/runs/${run_id}`));
  }

/** Modify run */
  async updateRun(thread_id: string | number, run_id: string | number, body: UpdateRunRequest): Promise<RunResponse> {
    return this.client.post<RunResponse>(aiApiPath(`/threads/${thread_id}/runs/${run_id}`), body);
  }

/** List runs */
  async listRuns(thread_id: string | number, params?: QueryParams): Promise<RunListResponse> {
    return this.client.get<RunListResponse>(aiApiPath(`/threads/${thread_id}/runs`), params);
  }

/** Create run */
  async createRun(thread_id: string | number, body: RunCreateRequest): Promise<CreateRunResponse> {
    return this.client.post<CreateRunResponse>(aiApiPath(`/threads/${thread_id}/runs`), body);
  }

/** Get thread message */
  async getThreadMessage(thread_id: string | number, message_id: string | number): Promise<ThreadMessageResponse> {
    return this.client.get<ThreadMessageResponse>(aiApiPath(`/threads/${thread_id}/messages/${message_id}`));
  }

/** Modify thread message */
  async updateThreadMessage(thread_id: string | number, message_id: string | number, body: ThreadMessageModifyRequest): Promise<ThreadMessageResponse> {
    return this.client.post<ThreadMessageResponse>(aiApiPath(`/threads/${thread_id}/messages/${message_id}`), body);
  }

/** List thread messages */
  async listThreadMessages(thread_id: string | number, params?: QueryParams): Promise<ThreadMessageListResponse> {
    return this.client.get<ThreadMessageListResponse>(aiApiPath(`/threads/${thread_id}/messages`), params);
  }

/** Create thread message */
  async createThreadMessage(thread_id: string | number, body: ThreadMessageCreateRequest): Promise<ThreadMessageResponse> {
    return this.client.post<ThreadMessageResponse>(aiApiPath(`/threads/${thread_id}/messages`), body);
  }

/** Get thread */
  async getThread(thread_id: string | number): Promise<ThreadResponse> {
    return this.client.get<ThreadResponse>(aiApiPath(`/threads/${thread_id}`));
  }

/** Update thread */
  async updateThread(thread_id: string | number, body: ThreadCreateRequest): Promise<ThreadResponse> {
    return this.client.post<ThreadResponse>(aiApiPath(`/threads/${thread_id}`), body);
  }

/** Delete thread */
  async deleteThread(thread_id: string | number): Promise<ThreadDeleteResponse> {
    return this.client.delete<ThreadDeleteResponse>(aiApiPath(`/threads/${thread_id}`));
  }

/** Create thread and run */
  async createThreadAndRun(body: ThreadRunCreateRequest): Promise<CreateThreadAndRunResponse> {
    return this.client.post<CreateThreadAndRunResponse>(aiApiPath(`/threads/runs`), body);
  }

/** Create thread */
  async createThread(body: ThreadCreateRequest): Promise<ThreadResponse> {
    return this.client.post<ThreadResponse>(aiApiPath(`/threads`), body);
  }

/** Get run step */
  async getRunStep(thread_id: string | number, run_id: string | number, step_id: string | number): Promise<RunStepResponse> {
    return this.client.get<RunStepResponse>(aiApiPath(`/threads/${thread_id}/runs/${run_id}/steps/${step_id}`));
  }

/** List run steps */
  async listRunSteps(thread_id: string | number, run_id: string | number, params?: QueryParams): Promise<RunStepListResponse> {
    return this.client.get<RunStepListResponse>(aiApiPath(`/threads/${thread_id}/runs/${run_id}/steps`), params);
  }
}

export function createThreadsApi(client: HttpClient): ThreadsApi {
  return new ThreadsApi(client);
}
