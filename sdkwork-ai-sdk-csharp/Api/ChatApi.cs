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
        public async Task<ChatCompletionResponse?> UpdateCompletionAsync(string completion_id, UpdateCompletionRequest body)
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
        public async Task<ChatCompletionResponse?> PatchUpdateCompletionAsync(string completion_id, PatchUpdateCompletionRequest body)
        {
            return await _client.PatchAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/chat/completions/{completion_id}"), body);
        }

        /// <summary>
        /// Count Claude tokens
        /// </summary>
        public async Task<CountClaudeTokensResponse?> CountClaudeTokensAsync(CountClaudeTokensRequest body)
        {
            return await _client.PostAsync<CountClaudeTokensResponse>(ApiPaths.AiPath("/messages/count_tokens"), body);
        }

        /// <summary>
        /// Create Claude message
        /// </summary>
        public async Task<CreateClaudeMessageResponse?> CreateClaudeMessageAsync(CreateClaudeMessageRequest body, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<CreateClaudeMessageResponse>(ApiPaths.AiPath("/messages"), body, null, headers);
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
        /// Get chat completion messages
        /// </summary>
        public async Task<ChatMessageList?> GetMessagesAsync(string completion_id, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ChatMessageList>(ApiPaths.AiPath($"/chat/completions/{completion_id}/messages"), query);
        }
    }
}
