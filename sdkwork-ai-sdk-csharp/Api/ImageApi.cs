using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class ImageApi
    {
        private readonly HttpClient _client;

        public ImageApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create image variation
        /// </summary>
        public async Task<ImageGenerationResponse?> CreateImageVariationAsync(CreateImageVariationRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<ImageGenerationResponse>(ApiPaths.AiPath("/images/variations"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// Create image
        /// </summary>
        public async Task<ImageGenerationResponse?> CreateImageAsync(ImageGenerationRequest body)
        {
            return await _client.PostAsync<ImageGenerationResponse>(ApiPaths.AiPath("/images"), body);
        }

        /// <summary>
        /// Create image
        /// </summary>
        public async Task<ImageGenerationResponse?> CreateImageGenerationsAsync(ImageGenerationRequest body)
        {
            return await _client.PostAsync<ImageGenerationResponse>(ApiPaths.AiPath("/images/generations"), body);
        }

        /// <summary>
        /// Create image edit
        /// </summary>
        public async Task<ImageGenerationResponse?> CreateImageEditAsync(CreateImageEditPostRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<ImageGenerationResponse>(ApiPaths.AiPath("/images/edits"), body, query, null, "multipart/form-data");
        }
    }
}
