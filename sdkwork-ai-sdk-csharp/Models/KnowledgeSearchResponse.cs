using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class KnowledgeSearchResponse
    {
        public List<SearchResult>? Results { get; set; }
        public int? Total { get; set; }
    }
}
