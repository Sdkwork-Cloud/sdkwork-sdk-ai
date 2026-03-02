using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class DocumentResponse
    {
        public string? Title { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public string? DocumentId { get; set; }
        public string? KnowledgeBaseId { get; set; }
        public int? ChunkCount { get; set; }
        public int? CreatedAt { get; set; }
        public int? UpdatedAt { get; set; }
    }
}
