using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class RerankRequest
    {
        public string? Query { get; set; }
        public List<Document>? Documents { get; set; }
        public string? Model { get; set; }
        public int? TopN { get; set; }
        public bool? ReturnDocuments { get; set; }
    }
}
