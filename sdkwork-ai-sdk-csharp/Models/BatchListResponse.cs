using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class BatchListResponse
    {
        public string? Object { get; set; }
        public List<BatchResponse>? Data { get; set; }
        public bool? HasMore { get; set; }
        public string? FirstId { get; set; }
        public string? LastId { get; set; }
    }
}
