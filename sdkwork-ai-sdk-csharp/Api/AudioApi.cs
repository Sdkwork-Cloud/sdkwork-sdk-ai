using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class AudioApi
    {
        private readonly HttpClient _client;

        public AudioApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create translation
        /// </summary>
        public async Task<TranscriptionResponse?> CreateTranslationAsync(CreateTranslationRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<TranscriptionResponse>(ApiPaths.AiPath("/audio/translations"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// Create transcription
        /// </summary>
        public async Task<TranscriptionResponse?> CreateTranscriptionAsync(CreateTranscriptionPostRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<TranscriptionResponse>(ApiPaths.AiPath("/audio/transcriptions"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// Create speech
        /// </summary>
        public async Task<string?> CreateSpeechAsync(SpeechRequest body)
        {
            return await _client.PostAsync<string>(ApiPaths.AiPath("/audio/speech"), body);
        }
    }
}
