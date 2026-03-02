using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class JsonSchema
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public object? Schema { get; set; }
        public bool? Strict { get; set; }
    }
}
