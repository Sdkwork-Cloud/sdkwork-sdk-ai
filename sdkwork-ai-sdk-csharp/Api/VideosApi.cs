using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class VideosApi
    {
        private readonly HttpClient _client;

        public VideosApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// List videos
        /// </summary>
        public async Task<OpenAiVideoList?> ListVideosAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<OpenAiVideoList>(ApiPaths.AiPath("/videos"), query);
        }

        /// <summary>
        /// Create video
        /// </summary>
        public async Task<OpenAiVideo?> CreateVideoAsync(VideoGenerationRequest body)
        {
            return await _client.PostAsync<OpenAiVideo>(ApiPaths.AiPath("/videos"), body);
        }

        /// <summary>
        /// Retrieve video
        /// </summary>
        public async Task<OpenAiVideo?> RetrieveVideoAsync(string videoId)
        {
            return await _client.GetAsync<OpenAiVideo>(ApiPaths.AiPath($"/videos/{videoId}"));
        }

        /// <summary>
        /// Delete video
        /// </summary>
        public async Task<OpenAiVideoDeleteResponse?> DeleteVideoAsync(string videoId)
        {
            return await _client.DeleteAsync<OpenAiVideoDeleteResponse>(ApiPaths.AiPath($"/videos/{videoId}"));
        }
    }
}
