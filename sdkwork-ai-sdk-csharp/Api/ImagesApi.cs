using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class ImagesApi
    {
        private readonly HttpClient _client;

        public ImagesApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create image variation
        /// </summary>
        public async Task<ImageGenerationResponse?> CreateImageVariationAsync(ImageGenerationRequest body)
        {
            return await _client.PostAsync<ImageGenerationResponse>(ApiPaths.AiPath("/images/variations"), body);
        }

        /// <summary>
        /// Create image
        /// </summary>
        public async Task<ImageGenerationResponse?> CreateImageAsync(ImageGenerationRequest body)
        {
            return await _client.PostAsync<ImageGenerationResponse>(ApiPaths.AiPath("/images/generations"), body);
        }

        /// <summary>
        /// Create image edit
        /// </summary>
        public async Task<ImageGenerationResponse?> CreateImageEditAsync(ImageGenerationRequest body)
        {
            return await _client.PostAsync<ImageGenerationResponse>(ApiPaths.AiPath("/images/edits"), body);
        }
    }
}
