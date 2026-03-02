using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class SearchResult
    {
        public string? Content { get; set; }
        public double? Score { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public string? DocumentId { get; set; }
        public string? ChunkId { get; set; }
    }
}
