using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ThreadResponse
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public int? CreatedAt { get; set; }
        public Dictionary<string, object>? ToolResources { get; set; }
    }
}
