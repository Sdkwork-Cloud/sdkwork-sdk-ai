using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class ResponsesApi
    {
        private readonly HttpClient _client;

        public ResponsesApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Cancel response
        /// </summary>
        public async Task<CancelResponseResponse?> CancelResponseAsync(string response_id)
        {
            return await _client.PostAsync<CancelResponseResponse>(ApiPaths.AiPath($"/responses/{response_id}/cancel"), null);
        }

        /// <summary>
        /// Create response
        /// </summary>
        public async Task<CreateResponseResponse?> CreateResponseAsync(CreateResponseRequest body)
        {
            return await _client.PostAsync<CreateResponseResponse>(ApiPaths.AiPath("/responses"), body);
        }

        /// <summary>
        /// List response input items
        /// </summary>
        public async Task<ListResponseInputItemsResponse?> ListResponseInputItemsAsync(string response_id)
        {
            return await _client.GetAsync<ListResponseInputItemsResponse>(ApiPaths.AiPath($"/responses/{response_id}/input_items"));
        }

        /// <summary>
        /// Get response
        /// </summary>
        public async Task<GetResponseResponse?> GetResponseAsync(string response_id)
        {
            return await _client.GetAsync<GetResponseResponse>(ApiPaths.AiPath($"/responses/{response_id}"));
        }

        /// <summary>
        /// Delete response
        /// </summary>
        public async Task<DeleteResponseResponse?> DeleteResponseAsync(string response_id)
        {
            return await _client.DeleteAsync<DeleteResponseResponse>(ApiPaths.AiPath($"/responses/{response_id}"));
        }
    }
}
