using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class Videos2Api
    {
        private readonly HttpClient _client;

        public Videos2Api(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// List videos
        /// </summary>
        public async Task<OpenAiVideoList?> ListVideosAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<OpenAiVideoList>(ApiPaths.AiPath("/v1/videos"), query);
        }

        /// <summary>
        /// Create video
        /// </summary>
        public async Task<OpenAiVideo?> CreateVideoAsync(VideoGenerationRequest body)
        {
            return await _client.PostAsync<OpenAiVideo>(ApiPaths.AiPath("/v1/videos"), body);
        }

        /// <summary>
        /// Retrieve video
        /// </summary>
        public async Task<OpenAiVideo?> RetrieveVideoAsync(string video_id)
        {
            return await _client.GetAsync<OpenAiVideo>(ApiPaths.AiPath($"/v1/videos/{video_id}"));
        }

        /// <summary>
        /// Delete video
        /// </summary>
        public async Task<OpenAiVideoDeleteResponse?> DeleteVideoAsync(string video_id)
        {
            return await _client.DeleteAsync<OpenAiVideoDeleteResponse>(ApiPaths.AiPath($"/v1/videos/{video_id}"));
        }
    }
}
