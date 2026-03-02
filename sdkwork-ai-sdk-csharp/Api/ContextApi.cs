using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class ContextApi
    {
        private readonly HttpClient _client;

        public ContextApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Chat with context
        /// </summary>
        public async Task<ContextResponse?> ChatWithAsync(string contextId, ChatWithContextRequest body)
        {
            return await _client.PostAsync<ContextResponse>(ApiPaths.AiPath($"/context/{contextId}/chat/completions"), body);
        }

        /// <summary>
        /// Create context
        /// </summary>
        public async Task<ContextResponse?> CreateContextAsync(ContextCreateRequest body)
        {
            return await _client.PostAsync<ContextResponse>(ApiPaths.AiPath("/context/create"), body);
        }

        /// <summary>
        /// Get context
        /// </summary>
        public async Task<ContextResponse?> GetContextAsync(string contextId)
        {
            return await _client.GetAsync<ContextResponse>(ApiPaths.AiPath($"/context/{contextId}"));
        }

        /// <summary>
        /// Delete context
        /// </summary>
        public async Task DeleteContextAsync(string contextId)
        {
            await _client.DeleteAsync<object>(ApiPaths.AiPath($"/context/{contextId}"));
        }
    }
}
