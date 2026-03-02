using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class EmbeddingResponse
    {
        public string? Object { get; set; }
        public List<Embedding>? Data { get; set; }
        public string? Model { get; set; }
        public Usage? Usage { get; set; }
    }
}
