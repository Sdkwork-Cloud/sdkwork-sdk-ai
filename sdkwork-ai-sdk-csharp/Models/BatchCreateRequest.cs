using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class BatchCreateRequest
    {
        public string? Endpoint { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public string? InputFileId { get; set; }
        public string? CompletionWindow { get; set; }
    }
}
