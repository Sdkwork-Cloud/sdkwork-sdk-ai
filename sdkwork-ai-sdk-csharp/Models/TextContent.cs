using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class TextContent
    {
        public string? Value { get; set; }
        public List<object>? Annotations { get; set; }
    }
}
