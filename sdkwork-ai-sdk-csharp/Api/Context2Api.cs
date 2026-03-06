using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class Context2Api
    {
        private readonly HttpClient _client;

        public Context2Api(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Chat with context
        /// </summary>
        public async Task<ContextResponse?> ChatWithAsync(string contextId, ChatWithContextPostRequest body)
        {
            return await _client.PostAsync<ContextResponse>(ApiPaths.AiPath($"/v1/context/{contextId}/chat/completions"), body);
        }

        /// <summary>
        /// Create context
        /// </summary>
        public async Task<ContextResponse?> CreateContextAsync(ContextCreateRequest body)
        {
            return await _client.PostAsync<ContextResponse>(ApiPaths.AiPath("/v1/context/create"), body);
        }

        /// <summary>
        /// Get context
        /// </summary>
        public async Task<ContextResponse?> GetContextAsync(string contextId)
        {
            return await _client.GetAsync<ContextResponse>(ApiPaths.AiPath($"/v1/context/{contextId}"));
        }

        /// <summary>
        /// Delete context
        /// </summary>
        public async Task DeleteContextAsync(string contextId)
        {
            await _client.DeleteAsync<object>(ApiPaths.AiPath($"/v1/context/{contextId}"));
        }
    }
}
