using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class Models2Api
    {
        private readonly HttpClient _client;

        public Models2Api(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Retrieve model
        /// </summary>
        public async Task<OpenAiModel?> RetrieveModelAsync(string model)
        {
            return await _client.GetAsync<OpenAiModel>(ApiPaths.AiPath($"/v1/models/{model}"));
        }

        /// <summary>
        /// Delete model
        /// </summary>
        public async Task<OpenAiModelDeleteResponse?> DeleteModelAsync(string model)
        {
            return await _client.DeleteAsync<OpenAiModelDeleteResponse>(ApiPaths.AiPath($"/v1/models/{model}"));
        }

        /// <summary>
        /// List models
        /// </summary>
        public async Task<OpenAiModelList?> ListModelsAsync()
        {
            return await _client.GetAsync<OpenAiModelList>(ApiPaths.AiPath("/v1/models"));
        }
    }
}
