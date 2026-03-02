using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class VideoGenerationRequest
    {
        public string? Prompt { get; set; }
        public string? Model { get; set; }
        public string? Seconds { get; set; }
        public string? Size { get; set; }
        public string? Quality { get; set; }
        public string? User { get; set; }
        public string? NegativePrompt { get; set; }
        public List<string>? ImageUrls { get; set; }
    }
}
