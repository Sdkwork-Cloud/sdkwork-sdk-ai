using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class RerankApi
    {
        private readonly HttpClient _client;

        public RerankApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Rerank documents
        /// </summary>
        public async Task<RerankResponse?> RerankAsync(RerankRequest body)
        {
            return await _client.PostAsync<RerankResponse>(ApiPaths.AiPath("/rerank"), body);
        }
    }
}
