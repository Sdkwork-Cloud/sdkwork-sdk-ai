using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ContextCreateRequest
    {
        public string? Model { get; set; }
        public List<ContextMessage>? Messages { get; set; }
        public string? Mode { get; set; }
        public int? Ttl { get; set; }
        public TruncationStrategy? TruncationStrategy { get; set; }
    }
}
