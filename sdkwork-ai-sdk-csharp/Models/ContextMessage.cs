using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ContextMessage
    {
        public string? Role { get; set; }
        public string? Content { get; set; }
        public string? Name { get; set; }
        public List<ToolCall>? ToolCalls { get; set; }
    }
}
