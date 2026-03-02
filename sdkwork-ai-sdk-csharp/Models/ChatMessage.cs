using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ChatMessage
    {
        public string? Role { get; set; }
        public object? Content { get; set; }
        public string? Name { get; set; }
        public string? Refusal { get; set; }
        public Audio? Audio { get; set; }
        public List<Annotation>? Annotations { get; set; }
        public List<ToolCall>? ToolCalls { get; set; }
        public string? ToolCallId { get; set; }
    }
}
