using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class KnowledgeSearchRequest
    {
        public string? Query { get; set; }
        public List<Filter>? Filters { get; set; }
        public string? KnowledgeBaseId { get; set; }
        public int? TopK { get; set; }
        public double? ScoreThreshold { get; set; }
    }
}
