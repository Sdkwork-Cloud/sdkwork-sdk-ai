using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class FileApi
    {
        private readonly HttpClient _client;

        public FileApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// List files
        /// </summary>
        public async Task<OpenAiFileList?> ListFilesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<OpenAiFileList>(ApiPaths.AiPath("/files"), query);
        }

        /// <summary>
        /// Upload file
        /// </summary>
        public async Task<OpenAiFileObject?> UploadAsync(UploadFileRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<OpenAiFileObject>(ApiPaths.AiPath("/files"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// Retrieve file content
        /// </summary>
        public async Task<string?> RetrieveFileContentAsync(string file_id)
        {
            return await _client.GetAsync<string>(ApiPaths.AiPath($"/files/{file_id}/content"));
        }

        /// <summary>
        /// Retrieve file
        /// </summary>
        public async Task<OpenAiFileObject?> RetrieveAsync(string file_id)
        {
            return await _client.GetAsync<OpenAiFileObject>(ApiPaths.AiPath($"/files/{file_id}"));
        }

        /// <summary>
        /// Delete file
        /// </summary>
        public async Task<OpenAiFileDeleteResponse?> DeleteFileAsync(string file_id)
        {
            return await _client.DeleteAsync<OpenAiFileDeleteResponse>(ApiPaths.AiPath($"/files/{file_id}"));
        }
    }
}
