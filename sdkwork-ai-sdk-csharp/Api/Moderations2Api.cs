using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class Moderations2Api
    {
        private readonly HttpClient _client;

        public Moderations2Api(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create moderation
        /// </summary>
        public async Task<ModerationResponse?> CreateModerationAsync(ModerationRequest body)
        {
            return await _client.PostAsync<ModerationResponse>(ApiPaths.AiPath("/moderations"), body);
        }
    }
}
