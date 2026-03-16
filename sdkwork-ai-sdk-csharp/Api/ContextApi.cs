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
        public async Task<ContextResponse?> ChatWithAsync(string context_id, ChatWithContextRequest body)
        {
            return await _client.PostAsync<ContextResponse>(ApiPaths.AiPath($"/context/{context_id}/chat/completions"), body);
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
        public async Task<ContextResponse?> GetContextAsync(string context_id)
        {
            return await _client.GetAsync<ContextResponse>(ApiPaths.AiPath($"/context/{context_id}"));
        }

        /// <summary>
        /// Delete context
        /// </summary>
        public async Task DeleteContextAsync(string context_id)
        {
            await _client.DeleteAsync<object>(ApiPaths.AiPath($"/context/{context_id}"));
        }
    }
}
