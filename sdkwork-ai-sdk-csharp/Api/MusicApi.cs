using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class MusicApi
    {
        private readonly HttpClient _client;

        public MusicApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Generate music
        /// </summary>
        public async Task<SunoMusic?> CreateGenerateAsync(MusicGenerationRequest body)
        {
            return await _client.PostAsync<SunoMusic>(ApiPaths.AiPath("/v1/music/generations"), body);
        }

        /// <summary>
        /// List music
        /// </summary>
        public async Task<SunoMusicList?> ListMusicAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<SunoMusicList>(ApiPaths.AiPath("/music"), query);
        }

        /// <summary>
        /// Generate music
        /// </summary>
        public async Task<SunoMusic?> CreateGenerateMusicAsync(MusicGenerationRequest body)
        {
            return await _client.PostAsync<SunoMusic>(ApiPaths.AiPath("/music"), body);
        }

        /// <summary>
        /// Generate music
        /// </summary>
        public async Task<SunoMusic?> CreateGenerateGenerationsAsync(MusicGenerationRequest body)
        {
            return await _client.PostAsync<SunoMusic>(ApiPaths.AiPath("/music/generations"), body);
        }

        /// <summary>
        /// Retrieve music
        /// </summary>
        public async Task<SunoMusic?> RetrieveAsync(string music_id)
        {
            return await _client.GetAsync<SunoMusic>(ApiPaths.AiPath($"/music/{music_id}"));
        }

        /// <summary>
        /// Delete music
        /// </summary>
        public async Task<SunoMusicDeleteResponse?> DeleteMusicAsync(string music_id)
        {
            return await _client.DeleteAsync<SunoMusicDeleteResponse>(ApiPaths.AiPath($"/music/{music_id}"));
        }
    }
}
