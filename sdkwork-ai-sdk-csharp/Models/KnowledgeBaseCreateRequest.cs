using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class KnowledgeBaseCreateRequest
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public Dictionary<string, object>? Extra { get; set; }
        public string? EmbeddingModelId { get; set; }
        public string? IndexType { get; set; }
    }
}
