using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class Rerank2Api
    {
        private readonly HttpClient _client;

        public Rerank2Api(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Rerank documents
        /// </summary>
        public async Task<RerankResponse?> RerankAsync(RerankRequest body)
        {
            return await _client.PostAsync<RerankResponse>(ApiPaths.AiPath("/v1/rerank"), body);
        }
    }
}
