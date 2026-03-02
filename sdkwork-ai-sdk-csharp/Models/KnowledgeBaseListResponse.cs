using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class KnowledgeBaseListResponse
    {
        public List<KnowledgeBaseResponse>? Data { get; set; }
        public int? Total { get; set; }
        public bool? HasMore { get; set; }
    }
}
