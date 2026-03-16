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
        public int? Width { get; set; }
        public int? Height { get; set; }
        public int? Seed { get; set; }
        public string? User { get; set; }
        public string? NegativePrompt { get; set; }
        public List<string>? ImageUrls { get; set; }
        public string? AspectRatio { get; set; }
        public string? ResponseFormat { get; set; }
    }
}
