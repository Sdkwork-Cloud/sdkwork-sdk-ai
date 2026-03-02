using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class KnowledgeBaseResponse
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
        public string? KnowledgeBaseId { get; set; }
        public string? EmbeddingModelId { get; set; }
        public string? IndexType { get; set; }
        public int? CreatedAt { get; set; }
        public int? UpdatedAt { get; set; }
        public int? DocCount { get; set; }
    }
}
