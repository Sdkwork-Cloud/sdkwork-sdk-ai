using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class AssistantApi
    {
        private readonly HttpClient _client;

        public AssistantApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get assistant
        /// </summary>
        public async Task<AssistantResponse?> GetAssistantAsync(string assistant_id)
        {
            return await _client.GetAsync<AssistantResponse>(ApiPaths.AiPath($"/assistants/{assistant_id}"));
        }

        /// <summary>
        /// Update assistant
        /// </summary>
        public async Task<AssistantResponse?> UpdateAssistantAsync(string assistant_id, AssistantCreateRequest body)
        {
            return await _client.PostAsync<AssistantResponse>(ApiPaths.AiPath($"/assistants/{assistant_id}"), body);
        }

        /// <summary>
        /// Delete assistant
        /// </summary>
        public async Task<AssistantDeleteResponse?> DeleteAssistantAsync(string assistant_id)
        {
            return await _client.DeleteAsync<AssistantDeleteResponse>(ApiPaths.AiPath($"/assistants/{assistant_id}"));
        }

        /// <summary>
        /// List assistants
        /// </summary>
        public async Task<AssistantListResponse?> ListAssistantsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<AssistantListResponse>(ApiPaths.AiPath("/assistants"), query);
        }

        /// <summary>
        /// Create assistant
        /// </summary>
        public async Task<AssistantResponse?> CreateAssistantAsync(AssistantCreateRequest body)
        {
            return await _client.PostAsync<AssistantResponse>(ApiPaths.AiPath("/assistants"), body);
        }
    }
}
