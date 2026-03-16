using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class ThreadApi
    {
        private readonly HttpClient _client;

        public ThreadApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Submit tool outputs
        /// </summary>
        public async Task<SubmitToolOutputsPostResponse?> SubmitToolOutputsAsync(string thread_id, string run_id, SubmitToolOutputsPostRequest body)
        {
            return await _client.PostAsync<SubmitToolOutputsPostResponse>(ApiPaths.AiPath($"/threads/{thread_id}/runs/{run_id}/submit_tool_outputs"), body);
        }

        /// <summary>
        /// Cancel run
        /// </summary>
        public async Task<RunResponse?> CancelRunAsync(string thread_id, string run_id)
        {
            return await _client.PostAsync<RunResponse>(ApiPaths.AiPath($"/threads/{thread_id}/runs/{run_id}/cancel"), null);
        }

        /// <summary>
        /// Get run
        /// </summary>
        public async Task<RunResponse?> GetRunAsync(string thread_id, string run_id)
        {
            return await _client.GetAsync<RunResponse>(ApiPaths.AiPath($"/threads/{thread_id}/runs/{run_id}"));
        }

        /// <summary>
        /// Modify run
        /// </summary>
        public async Task<RunResponse?> UpdateRunAsync(string thread_id, string run_id, UpdateRunRequest body)
        {
            return await _client.PostAsync<RunResponse>(ApiPaths.AiPath($"/threads/{thread_id}/runs/{run_id}"), body);
        }

        /// <summary>
        /// List runs
        /// </summary>
        public async Task<RunListResponse?> ListRunsAsync(string thread_id, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<RunListResponse>(ApiPaths.AiPath($"/threads/{thread_id}/runs"), query);
        }

        /// <summary>
        /// Create run
        /// </summary>
        public async Task<CreateRunPostResponse?> CreateRunAsync(string thread_id, RunCreateRequest body)
        {
            return await _client.PostAsync<CreateRunPostResponse>(ApiPaths.AiPath($"/threads/{thread_id}/runs"), body);
        }

        /// <summary>
        /// Get thread message
        /// </summary>
        public async Task<ThreadMessageResponse?> GetThreadMessageAsync(string thread_id, string message_id)
        {
            return await _client.GetAsync<ThreadMessageResponse>(ApiPaths.AiPath($"/threads/{thread_id}/messages/{message_id}"));
        }

        /// <summary>
        /// Modify thread message
        /// </summary>
        public async Task<ThreadMessageResponse?> UpdateThreadMessageAsync(string thread_id, string message_id, ThreadMessageModifyRequest body)
        {
            return await _client.PostAsync<ThreadMessageResponse>(ApiPaths.AiPath($"/threads/{thread_id}/messages/{message_id}"), body);
        }

        /// <summary>
        /// List thread messages
        /// </summary>
        public async Task<ThreadMessageListResponse?> ListThreadMessagesAsync(string thread_id, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ThreadMessageListResponse>(ApiPaths.AiPath($"/threads/{thread_id}/messages"), query);
        }

        /// <summary>
        /// Create thread message
        /// </summary>
        public async Task<ThreadMessageResponse?> CreateThreadMessageAsync(string thread_id, ThreadMessageCreateRequest body)
        {
            return await _client.PostAsync<ThreadMessageResponse>(ApiPaths.AiPath($"/threads/{thread_id}/messages"), body);
        }

        /// <summary>
        /// Get thread
        /// </summary>
        public async Task<ThreadResponse?> GetThreadAsync(string thread_id)
        {
            return await _client.GetAsync<ThreadResponse>(ApiPaths.AiPath($"/threads/{thread_id}"));
        }

        /// <summary>
        /// Update thread
        /// </summary>
        public async Task<ThreadResponse?> UpdateThreadAsync(string thread_id, ThreadCreateRequest body)
        {
            return await _client.PostAsync<ThreadResponse>(ApiPaths.AiPath($"/threads/{thread_id}"), body);
        }

        /// <summary>
        /// Delete thread
        /// </summary>
        public async Task<ThreadDeleteResponse?> DeleteThreadAsync(string thread_id)
        {
            return await _client.DeleteAsync<ThreadDeleteResponse>(ApiPaths.AiPath($"/threads/{thread_id}"));
        }

        /// <summary>
        /// Create thread and run
        /// </summary>
        public async Task<CreateThreadAndRunResponse?> CreateThreadAndRunAsync(ThreadRunCreateRequest body)
        {
            return await _client.PostAsync<CreateThreadAndRunResponse>(ApiPaths.AiPath("/threads/runs"), body);
        }

        /// <summary>
        /// Create thread
        /// </summary>
        public async Task<ThreadResponse?> CreateThreadAsync(ThreadCreateRequest? body = null)
        {
            return await _client.PostAsync<ThreadResponse>(ApiPaths.AiPath("/threads"), body);
        }

        /// <summary>
        /// Get run step
        /// </summary>
        public async Task<RunStepResponse?> GetRunStepAsync(string thread_id, string run_id, string step_id)
        {
            return await _client.GetAsync<RunStepResponse>(ApiPaths.AiPath($"/threads/{thread_id}/runs/{run_id}/steps/{step_id}"));
        }

        /// <summary>
        /// List run steps
        /// </summary>
        public async Task<RunStepListResponse?> ListRunStepsAsync(string thread_id, string run_id, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<RunStepListResponse>(ApiPaths.AiPath($"/threads/{thread_id}/runs/{run_id}/steps"), query);
        }
    }
}
