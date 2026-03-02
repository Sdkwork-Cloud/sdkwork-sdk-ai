using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class DocumentAddRequest
    {
        public string? Content { get; set; }
        public string? Title { get; set; }
        public string? Type { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public ChunkConfig? ChunkConfig { get; set; }
        public string? KnowledgeBaseId { get; set; }
    }
}
