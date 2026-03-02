using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Message
    {
        public string? Role { get; set; }
        public object? Content { get; set; }
        public string? Refusal { get; set; }
        public List<object>? Annotations { get; set; }
        public string? ReasoningContent { get; set; }
        public List<ToolCall>? ToolCalls { get; set; }
    }
}
