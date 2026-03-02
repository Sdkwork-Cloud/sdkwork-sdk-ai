using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ImageGenerationRequest
    {
        public string? Model { get; set; }
        public string? Prompt { get; set; }
        public int? N { get; set; }
        public string? Quality { get; set; }
        public string? Size { get; set; }
        public string? Style { get; set; }
        public string? User { get; set; }
        public List<string>? Image { get; set; }
        public Dictionary<string, object>? Extra { get; set; }
        public string? ResponseFormat { get; set; }
    }
}
