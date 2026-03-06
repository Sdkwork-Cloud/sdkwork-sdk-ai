using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class AssistantsApi
    {
        private readonly HttpClient _client;

        public AssistantsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get assistant
        /// </summary>
        public async Task<AssistantResponse?> GetAssistantAsync(string assistant_id)
        {
            return await _client.GetAsync<AssistantResponse>(ApiPaths.AiPath($"/v1/assistants/{assistant_id}"));
        }

        /// <summary>
        /// Update assistant
        /// </summary>
        public async Task<AssistantResponse?> UpdateAssistantAsync(string assistant_id, AssistantCreateRequest body)
        {
            return await _client.PostAsync<AssistantResponse>(ApiPaths.AiPath($"/v1/assistants/{assistant_id}"), body);
        }

        /// <summary>
        /// Delete assistant
        /// </summary>
        public async Task<AssistantDeleteResponse?> DeleteAssistantAsync(string assistant_id)
        {
            return await _client.DeleteAsync<AssistantDeleteResponse>(ApiPaths.AiPath($"/v1/assistants/{assistant_id}"));
        }

        /// <summary>
        /// List assistants
        /// </summary>
        public async Task<AssistantListResponse?> ListAssistantsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<AssistantListResponse>(ApiPaths.AiPath("/v1/assistants"), query);
        }

        /// <summary>
        /// Create assistant
        /// </summary>
        public async Task<AssistantResponse?> CreateAssistantAsync(AssistantCreateRequest body)
        {
            return await _client.PostAsync<AssistantResponse>(ApiPaths.AiPath("/v1/assistants"), body);
        }
    }
}
