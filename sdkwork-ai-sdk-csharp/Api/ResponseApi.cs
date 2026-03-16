using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class ResponseApi
    {
        private readonly HttpClient _client;

        public ResponseApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Cancel response
        /// </summary>
        public async Task<CancelResponseResponse?> CancelAsync(string response_id)
        {
            return await _client.PostAsync<CancelResponseResponse>(ApiPaths.AiPath($"/responses/{response_id}/cancel"), null);
        }

        /// <summary>
        /// Create response
        /// </summary>
        public async Task<CreateResponsePostResponse?> CreateResponseAsync(CreateResponsePostRequest body)
        {
            return await _client.PostAsync<CreateResponsePostResponse>(ApiPaths.AiPath("/responses"), body);
        }

        /// <summary>
        /// List response input items
        /// </summary>
        public async Task<ListResponseInputItemsGetResponse?> ListResponseInputItemsAsync(string response_id)
        {
            return await _client.GetAsync<ListResponseInputItemsGetResponse>(ApiPaths.AiPath($"/responses/{response_id}/input_items"));
        }

        /// <summary>
        /// Get response
        /// </summary>
        public async Task<GetResponseGetResponse?> GetResponseAsync(string response_id)
        {
            return await _client.GetAsync<GetResponseGetResponse>(ApiPaths.AiPath($"/responses/{response_id}"));
        }

        /// <summary>
        /// Delete response
        /// </summary>
        public async Task<DeleteResponseDeleteResponse?> DeleteResponseAsync(string response_id)
        {
            return await _client.DeleteAsync<DeleteResponseDeleteResponse>(ApiPaths.AiPath($"/responses/{response_id}"));
        }
    }
}
