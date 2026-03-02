using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ToolCall
    {
        public string? Id { get; set; }
        public string? Type { get; set; }
        public FunctionCall? Function { get; set; }
    }
}
