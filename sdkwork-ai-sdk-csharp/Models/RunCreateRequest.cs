using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class RunCreateRequest
    {
        public string? Model { get; set; }
        public string? Instructions { get; set; }
        public List<object>? Tools { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public double? Temperature { get; set; }
        public bool? Stream { get; set; }
        public string? AssistantId { get; set; }
        public string? AdditionalInstructions { get; set; }
        public List<Dictionary<string, object>>? AdditionalMessages { get; set; }
        public Dictionary<string, object>? ToolResources { get; set; }
        public double? TopP { get; set; }
        public int? MaxPromptTokens { get; set; }
        public int? MaxCompletionTokens { get; set; }
        public TruncationStrategy? TruncationStrategy { get; set; }
    }
}
