using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class VideoApi
    {
        private readonly HttpClient _client;

        public VideoApi(HttpClient client)
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
        /// Create video
        /// </summary>
        public async Task<OpenAiVideo?> CreateVideoGenerationsAsync(VideoGenerationRequest body)
        {
            return await _client.PostAsync<OpenAiVideo>(ApiPaths.AiPath("/videos/generations"), body);
        }

        /// <summary>
        /// Create video
        /// </summary>
        public async Task<OpenAiVideo?> CreateVideoGenerations2Async(VideoGenerationRequest body)
        {
            return await _client.PostAsync<OpenAiVideo>(ApiPaths.AiPath("/v1/videos/generations"), body);
        }

        /// <summary>
        /// Retrieve video
        /// </summary>
        public async Task<OpenAiVideo?> RetrieveAsync(string video_id)
        {
            return await _client.GetAsync<OpenAiVideo>(ApiPaths.AiPath($"/videos/{video_id}"));
        }

        /// <summary>
        /// Delete video
        /// </summary>
        public async Task<OpenAiVideoDeleteResponse?> DeleteVideoAsync(string video_id)
        {
            return await _client.DeleteAsync<OpenAiVideoDeleteResponse>(ApiPaths.AiPath($"/videos/{video_id}"));
        }
    }
}
