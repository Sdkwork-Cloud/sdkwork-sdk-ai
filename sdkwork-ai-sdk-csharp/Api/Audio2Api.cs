using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class Audio2Api
    {
        private readonly HttpClient _client;

        public Audio2Api(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create translation
        /// </summary>
        public async Task<TranscriptionResponse?> CreateTranslationAsync(CreateTranslationPostRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<TranscriptionResponse>(ApiPaths.AiPath("/v1/audio/translations"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// Create transcription
        /// </summary>
        public async Task<TranscriptionResponse?> CreateTranscriptionAsync(CreateTranscriptionRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<TranscriptionResponse>(ApiPaths.AiPath("/v1/audio/transcriptions"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// Create speech
        /// </summary>
        public async Task<string?> CreateSpeechAsync(SpeechRequest body)
        {
            return await _client.PostAsync<string>(ApiPaths.AiPath("/v1/audio/speech"), body);
        }
    }
}
