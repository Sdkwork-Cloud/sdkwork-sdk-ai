using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ContextResponse
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public int? Created { get; set; }
        public string? Model { get; set; }
        public string? Mode { get; set; }
        public int? Ttl { get; set; }
        public TruncationStrategy? TruncationStrategy { get; set; }
        public Usage? Usage { get; set; }
    }
}
