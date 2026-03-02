using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class EmbeddingRequest
    {
        public string? Model { get; set; }
        public object? Input { get; set; }
        public int? Dimensions { get; set; }
        public string? User { get; set; }
        public string? EncodingFormat { get; set; }
    }
}
