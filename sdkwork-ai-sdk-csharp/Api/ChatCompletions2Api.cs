using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class ChatCompletions2Api
    {
        private readonly HttpClient _client;

        public ChatCompletions2Api(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get chat completion
        /// </summary>
        public async Task<ChatCompletionResponse?> GetChatCompletionAsync(string completionId)
        {
            return await _client.GetAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/v1/management/chat/completions/{completionId}"));
        }

        /// <summary>
        /// Update chat completion
        /// </summary>
        public async Task<ChatCompletionResponse?> UpdateChatCompletionAsync(string completionId, UpdateChatCompletionPostRequest body)
        {
            return await _client.PostAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/v1/management/chat/completions/{completionId}"), body);
        }

        /// <summary>
        /// Delete chat completion
        /// </summary>
        public async Task<ChatCompletionDeleteResponse?> DeleteChatCompletionAsync(string completionId)
        {
            return await _client.DeleteAsync<ChatCompletionDeleteResponse>(ApiPaths.AiPath($"/v1/management/chat/completions/{completionId}"));
        }

        /// <summary>
        /// Get chat messages
        /// </summary>
        public async Task<ChatMessageList?> GetChatMessagesAsync(string completionId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ChatMessageList>(ApiPaths.AiPath($"/v1/management/chat/completions/{completionId}/messages"), query);
        }

        /// <summary>
        /// List chat completions
        /// </summary>
        public async Task<ChatCompletionList?> ListChatCompletionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ChatCompletionList>(ApiPaths.AiPath("/v1/management/chat/completions"), query);
        }
    }
}
