using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class Images2Api
    {
        private readonly HttpClient _client;

        public Images2Api(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Create image variation
        /// </summary>
        public async Task<ImageGenerationResponse?> CreateImageVariationAsync(CreateImageVariationPostRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<ImageGenerationResponse>(ApiPaths.AiPath("/v1/images/variations"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// Create image
        /// </summary>
        public async Task<ImageGenerationResponse?> CreateImageAsync(ImageGenerationRequest body)
        {
            return await _client.PostAsync<ImageGenerationResponse>(ApiPaths.AiPath("/v1/images/generations"), body);
        }

        /// <summary>
        /// Create image edit
        /// </summary>
        public async Task<ImageGenerationResponse?> CreateImageEditAsync(CreateImageEditRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<ImageGenerationResponse>(ApiPaths.AiPath("/v1/images/edits"), body, query, null, "multipart/form-data");
        }
    }
}
