using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class MusicGenerationRequest
    {
        public string? Model { get; set; }
        public string? Prompt { get; set; }
        public string? NegativePrompt { get; set; }
        public int? Duration { get; set; }
        public string? Format { get; set; }
        public int? N { get; set; }
        public string? ReferenceAudio { get; set; }
        public string? Style { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public string? ResponseFormat { get; set; }
    }
}
