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
            return await _client.GetAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/v1/chat/completions/{completion_id}"));
        }

        /// <summary>
        /// Update chat completion
        /// </summary>
        public async Task<ChatCompletionResponse?> CreateUpdateCompletionAsync(string completion_id, UpdateCompletionRequest body)
        {
            return await _client.PostAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/v1/chat/completions/{completion_id}"), body);
        }

        /// <summary>
        /// Delete chat completion
        /// </summary>
        public async Task<ChatCompletionDeleteResponse?> DeleteCompletionAsync(string completion_id)
        {
            return await _client.DeleteAsync<ChatCompletionDeleteResponse>(ApiPaths.AiPath($"/v1/chat/completions/{completion_id}"));
        }

        /// <summary>
        /// Update chat completion
        /// </summary>
        public async Task<ChatCompletionResponse?> PatchUpdateCompletionAsync(string completion_id, UpdateCompletionPatchRequest body)
        {
            return await _client.PatchAsync<ChatCompletionResponse>(ApiPaths.AiPath($"/v1/chat/completions/{completion_id}"), body);
        }

        /// <summary>
        /// Count Claude tokens
        /// </summary>
        public async Task<CountClaudeTokensResponse?> CountClaudeTokensAsync(CountClaudeTokensRequest body)
        {
            return await _client.PostAsync<CountClaudeTokensResponse>(ApiPaths.AiPath("/v1/messages/count_tokens"), body);
        }

        /// <summary>
        /// Create Claude message
        /// </summary>
        public async Task<CreateClaudeMessagePostResponse?> CreateClaudeMessageAsync(CreateClaudeMessagePostRequest body, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<CreateClaudeMessagePostResponse>(ApiPaths.AiPath("/v1/messages"), body, null, headers);
        }

        /// <summary>
        /// List chat completions
        /// </summary>
        public async Task<ChatCompletionList?> ListCompletionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ChatCompletionList>(ApiPaths.AiPath("/v1/chat/completions"), query);
        }

        /// <summary>
        /// Create chat completion
        /// </summary>
        public async Task<CreateChatCompletionPostResponse?> CreateChatCompletionAsync(ChatCompletionRequest body)
        {
            return await _client.PostAsync<CreateChatCompletionPostResponse>(ApiPaths.AiPath("/v1/chat/completions"), body);
        }

        /// <summary>
        /// Get chat completion messages
        /// </summary>
        public async Task<ChatMessageList?> GetMessagesAsync(string completion_id, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ChatMessageList>(ApiPaths.AiPath($"/v1/chat/completions/{completion_id}/messages"), query);
        }
    }
}
