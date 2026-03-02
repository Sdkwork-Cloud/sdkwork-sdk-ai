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
        public async Task<SunoMusic?> GenerateAsync(MusicGenerationRequest body)
        {
            return await _client.PostAsync<SunoMusic>(ApiPaths.AiPath("/music/generations"), body);
        }

        /// <summary>
        /// Retrieve music
        /// </summary>
        public async Task<SunoMusic?> RetrieveAsync(string musicId)
        {
            return await _client.GetAsync<SunoMusic>(ApiPaths.AiPath($"/music/{musicId}"));
        }

        /// <summary>
        /// Delete music
        /// </summary>
        public async Task<SunoMusicDeleteResponse?> DeleteMusicAsync(string musicId)
        {
            return await _client.DeleteAsync<SunoMusicDeleteResponse>(ApiPaths.AiPath($"/music/{musicId}"));
        }

        /// <summary>
        /// List music
        /// </summary>
        public async Task<SunoMusicList?> ListMusicAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<SunoMusicList>(ApiPaths.AiPath("/music"), query);
        }
    }
}
