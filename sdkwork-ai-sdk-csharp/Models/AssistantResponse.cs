using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class AssistantResponse
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public string? Model { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Instructions { get; set; }
        public List<object>? Tools { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public double? Temperature { get; set; }
        public int? CreatedAt { get; set; }
        public Dictionary<string, object>? ToolResources { get; set; }
        public object? ResponseFormat { get; set; }
        public double? TopP { get; set; }
    }
}
