using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class EmbeddingApi
    {
        private readonly HttpClient _client;

        public EmbeddingApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create embeddings
        /// </summary>
        public async Task<EmbeddingResponse?> CreateEmbeddingAsync(EmbeddingRequest body)
        {
            return await _client.PostAsync<EmbeddingResponse>(ApiPaths.AiPath("/embeddings"), body);
        }
    }
}
