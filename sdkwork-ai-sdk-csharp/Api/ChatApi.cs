using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class ChatApi
    {
        private readonly HttpClient _client;

        public ChatApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get chat completion
        /// </summary>
        public async Task<ChatCompletionResponse?> GetCompletionAsync(string completion_id)
        {
            return await _client.GetAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/chat/completions/{completion_id}"));
        }

        /// <summary>
        /// Update chat completion
        /// </summary>
        public async Task<ChatCompletionResponse?> CreateUpdateCompletionAsync(string completion_id, UpdateCompletionPostRequest body)
        {
            return await _client.PostAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/chat/completions/{completion_id}"), body);
        }

        /// <summary>
        /// Delete chat completion
        /// </summary>
        public async Task<ChatCompletionDeleteResponse?> DeleteCompletionAsync(string completion_id)
        {
            return await _client.DeleteAsync<ChatCompletionDeleteResponse>(ApiPaths.AiPath($"/chat/completions/{completion_id}"));
        }

        /// <summary>
        /// Update chat completion
        /// </summary>
        public async Task<ChatCompletionResponse?> PatchUpdateCompletionAsync(string completion_id, UpdateCompletionPatchRequest body)
        {
            return await _client.PatchAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/v1/chat/completions/{completion_id}"), body);
        }

        /// <summary>
        /// Update chat completion
        /// </summary>
        public async Task<ChatCompletionResponse?> PatchUpdateCompletionChatAsync(string completion_id, PatchUpdateCompletionRequest body)
        {
            return await _client.PatchAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/chat/completions/{completion_id}"), body);
        }

        /// <summary>
        /// Get chat completion
        /// </summary>
        public async Task<ChatCompletionResponse?> GetChatCompletionAsync(string completion_id)
        {
            return await _client.GetAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/management/chat/completions/{completion_id}"));
        }

        /// <summary>
        /// Update chat completion
        /// </summary>
        public async Task<ChatCompletionResponse?> UpdateChatCompletionAsync(string completion_id, UpdateChatCompletionRequest body)
        {
            return await _client.PostAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/management/chat/completions/{completion_id}"), body);
        }

        /// <summary>
        /// Delete chat completion
        /// </summary>
        public async Task<ChatCompletionDeleteResponse?> DeleteChatCompletionAsync(string completion_id)
        {
            return await _client.DeleteAsync<ChatCompletionDeleteResponse>(ApiPaths.AiPath($"/management/chat/completions/{completion_id}"));
        }

        /// <summary>
        /// List chat completions
        /// </summary>
        public async Task<ChatCompletionList?> ListCompletionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ChatCompletionList>(ApiPaths.AiPath("/chat/completions"), query);
        }

        /// <summary>
        /// Create chat completion
        /// </summary>
        public async Task<CreateChatCompletionResponse?> CreateChatCompletionAsync(ChatCompletionRequest body)
        {
            return await _client.PostAsync<CreateChatCompletionResponse>(ApiPaths.AiPath("/chat/completions"), body);
        }

        /// <summary>
        /// Get chat messages
        /// </summary>
        public async Task<ChatMessageList?> GetChatMessagesAsync(string completion_id, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ChatMessageList>(ApiPaths.AiPath($"/management/chat/completions/{completion_id}/messages"), query);
        }

        /// <summary>
        /// List chat completions
        /// </summary>
        public async Task<ChatCompletionList?> ListChatCompletionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ChatCompletionList>(ApiPaths.AiPath("/management/chat/completions"), query);
        }

        /// <summary>
        /// Get chat completion messages
        /// </summary>
        public async Task<ChatMessageList?> GetMessagesAsync(string completion_id, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ChatMessageList>(ApiPaths.AiPath($"/chat/completions/{completion_id}/messages"), query);
        }
    }
}
