using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class MessageApi
    {
        private readonly HttpClient _client;

        public MessageApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Count Claude tokens
        /// </summary>
        public async Task<CountClaudeTokensPostResponse?> CountClaudeTokensAsync(CountClaudeTokensPostRequest body)
        {
            return await _client.PostAsync<CountClaudeTokensPostResponse>(ApiPaths.AiPath("/messages/count_tokens"), body);
        }

        /// <summary>
        /// Create Claude message
        /// </summary>
        public async Task<CreateClaudeMessageResponse?> CreateClaudeAsync(CreateClaudeMessageRequest body, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<CreateClaudeMessageResponse>(ApiPaths.AiPath("/messages"), body, null, headers);
        }
    }
}
