using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class OpenApi
    {
        private readonly HttpClient _client;

        public OpenApi(HttpClient client)
        {
            _client = client;
        }

        public async Task<PlusApiResultListLabelOption?> GetOptionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListLabelOption>(ApiPaths.AiPath("/v1/open/i18n/options"), query);
        }

        public async Task<PlusApiResultListLabelOption?> CreateOptionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultListLabelOption>(ApiPaths.AiPath("/v1/open/i18n/options"), null, query);
        }
    }
}
