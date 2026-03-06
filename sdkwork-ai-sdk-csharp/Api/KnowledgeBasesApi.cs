using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class KnowledgeBasesApi
    {
        private readonly HttpClient _client;

        public KnowledgeBasesApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// List documents
        /// </summary>
        public async Task<ListDocumentsResponse?> ListDocumentsAsync(string knowledgeBaseId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ListDocumentsResponse>(ApiPaths.AiPath($"/v1/knowledge-bases/{knowledgeBaseId}/documents"), query);
        }

        /// <summary>
        /// Add document
        /// </summary>
        public async Task<DocumentResponse?> AddDocumentAsync(string knowledgeBaseId, DocumentAddRequest body)
        {
            return await _client.PostAsync<DocumentResponse>(ApiPaths.AiPath($"/v1/knowledge-bases/{knowledgeBaseId}/documents"), body);
        }

        /// <summary>
        /// Search knowledge
        /// </summary>
        public async Task<KnowledgeSearchResponse?> SearchKnowledgeAsync(KnowledgeSearchRequest body)
        {
            return await _client.PostAsync<KnowledgeSearchResponse>(ApiPaths.AiPath("/v1/knowledge-bases/search"), body);
        }

        /// <summary>
        /// List knowledge bases
        /// </summary>
        public async Task<KnowledgeBaseListResponse?> ListKnowledgeBasesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<KnowledgeBaseListResponse>(ApiPaths.AiPath("/v1/knowledge-bases"), query);
        }

        /// <summary>
        /// Create knowledge base
        /// </summary>
        public async Task<KnowledgeBaseResponse?> CreateKnowledgeBaseAsync(KnowledgeBaseCreateRequest body)
        {
            return await _client.PostAsync<KnowledgeBaseResponse>(ApiPaths.AiPath("/v1/knowledge-bases"), body);
        }

        /// <summary>
        /// Get document
        /// </summary>
        public async Task<DocumentResponse?> GetDocumentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.GetAsync<DocumentResponse>(ApiPaths.AiPath($"/v1/knowledge-bases/{knowledgeBaseId}/documents/{documentId}"));
        }

        /// <summary>
        /// Delete document
        /// </summary>
        public async Task DeleteDocumentAsync(string knowledgeBaseId, string documentId)
        {
            await _client.DeleteAsync<object>(ApiPaths.AiPath($"/v1/knowledge-bases/{knowledgeBaseId}/documents/{documentId}"));
        }

        /// <summary>
        /// Get knowledge base
        /// </summary>
        public async Task<KnowledgeBaseResponse?> GetKnowledgeBaseAsync(string knowledgeBaseId)
        {
            return await _client.GetAsync<KnowledgeBaseResponse>(ApiPaths.AiPath($"/v1/knowledge-bases/{knowledgeBaseId}"));
        }

        /// <summary>
        /// Delete knowledge base
        /// </summary>
        public async Task DeleteKnowledgeBaseAsync(string knowledgeBaseId)
        {
            await _client.DeleteAsync<object>(ApiPaths.AiPath($"/v1/knowledge-bases/{knowledgeBaseId}"));
        }
    }
}
