using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class Files2Api
    {
        private readonly HttpClient _client;

        public Files2Api(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// List files
        /// </summary>
        public async Task<OpenAiFileList?> ListFilesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<OpenAiFileList>(ApiPaths.AiPath("/v1/files"), query);
        }

        /// <summary>
        /// Upload file
        /// </summary>
        public async Task<OpenAiFileObject?> UploadFileAsync(UploadFilePostRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<OpenAiFileObject>(ApiPaths.AiPath("/v1/files"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// Retrieve file content
        /// </summary>
        public async Task<string?> RetrieveFileContentAsync(string fileId)
        {
            return await _client.GetAsync<string>(ApiPaths.AiPath($"/v1/files/{fileId}/content"));
        }

        /// <summary>
        /// Retrieve file
        /// </summary>
        public async Task<OpenAiFileObject?> RetrieveFileAsync(string fileId)
        {
            return await _client.GetAsync<OpenAiFileObject>(ApiPaths.AiPath($"/v1/files/{fileId}"));
        }

        /// <summary>
        /// Delete file
        /// </summary>
        public async Task<OpenAiFileDeleteResponse?> DeleteFileAsync(string fileId)
        {
            return await _client.DeleteAsync<OpenAiFileDeleteResponse>(ApiPaths.AiPath($"/v1/files/{fileId}"));
        }
    }
}
