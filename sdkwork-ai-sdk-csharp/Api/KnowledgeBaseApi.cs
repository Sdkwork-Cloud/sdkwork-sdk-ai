using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Ai.Http;
using Ai.Models;

namespace Ai.Api
{
    public class KnowledgeBaseApi
    {
        private readonly HttpClient _client;

        public KnowledgeBaseApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// List documents
        /// </summary>
        public async Task<ListDocumentsGetResponse?> ListDocumentsAsync(string knowledge_base_id, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<ListDocumentsGetResponse>(ApiPaths.AiPath($"/knowledge-bases/{knowledge_base_id}/documents"), query);
        }

        /// <summary>
        /// Add document
        /// </summary>
        public async Task<DocumentResponse?> AddDocumentAsync(string knowledge_base_id, DocumentAddRequest body)
        {
            return await _client.PostAsync<DocumentResponse>(ApiPaths.AiPath($"/knowledge-bases/{knowledge_base_id}/documents"), body);
        }

        /// <summary>
        /// Search knowledge
        /// </summary>
        public async Task<KnowledgeSearchResponse?> SearchKnowledgeAsync(KnowledgeSearchRequest body)
        {
            return await _client.PostAsync<KnowledgeSearchResponse>(ApiPaths.AiPath("/knowledge-bases/search"), body);
        }

        /// <summary>
        /// List knowledge bases
        /// </summary>
        public async Task<KnowledgeBaseListResponse?> ListKnowledgeBasesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<KnowledgeBaseListResponse>(ApiPaths.AiPath("/knowledge-bases"), query);
        }

        /// <summary>
        /// Create knowledge base
        /// </summary>
        public async Task<KnowledgeBaseResponse?> CreateKnowledgeBaseAsync(KnowledgeBaseCreateRequest body)
        {
            return await _client.PostAsync<KnowledgeBaseResponse>(ApiPaths.AiPath("/knowledge-bases"), body);
        }

        /// <summary>
        /// Get document
        /// </summary>
        public async Task<DocumentResponse?> GetDocumentAsync(string knowledge_base_id, string document_id)
        {
            return await _client.GetAsync<DocumentResponse>(ApiPaths.AiPath($"/knowledge-bases/{knowledge_base_id}/documents/{document_id}"));
        }

        /// <summary>
        /// Delete document
        /// </summary>
        public async Task DeleteDocumentAsync(string knowledge_base_id, string document_id)
        {
            await _client.DeleteAsync<object>(ApiPaths.AiPath($"/knowledge-bases/{knowledge_base_id}/documents/{document_id}"));
        }

        /// <summary>
        /// Get knowledge base
        /// </summary>
        public async Task<KnowledgeBaseResponse?> GetKnowledgeBaseAsync(string knowledge_base_id)
        {
            return await _client.GetAsync<KnowledgeBaseResponse>(ApiPaths.AiPath($"/knowledge-bases/{knowledge_base_id}"));
        }

        /// <summary>
        /// Delete knowledge base
        /// </summary>
        public async Task DeleteKnowledgeBaseAsync(string knowledge_base_id)
        {
            await _client.DeleteAsync<object>(ApiPaths.AiPath($"/knowledge-bases/{knowledge_base_id}"));
        }
    }
}
