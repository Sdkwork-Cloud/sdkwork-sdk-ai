using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class BatchApi
    {
        private readonly HttpClient _client;

        public BatchApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Cancel batch
        /// </summary>
        public async Task<BatchResponse?> CancelAsync(string batch_id)
        {
            return await _client.PostAsync<BatchResponse>(ApiPaths.AiPath($"/batches/{batch_id}/cancel"), null);
        }

        /// <summary>
        /// List batches
        /// </summary>
        public async Task<BatchListResponse?> ListBatchesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<BatchListResponse>(ApiPaths.AiPath("/batches"), query);
        }

        /// <summary>
        /// Create batch
        /// </summary>
        public async Task<BatchResponse?> CreateBatchAsync(BatchCreateRequest body)
        {
            return await _client.PostAsync<BatchResponse>(ApiPaths.AiPath("/batches"), body);
        }

        /// <summary>
        /// Get batch
        /// </summary>
        public async Task<BatchResponse?> GetBatchAsync(string batch_id)
        {
            return await _client.GetAsync<BatchResponse>(ApiPaths.AiPath($"/batches/{batch_id}"));
        }
    }
}
