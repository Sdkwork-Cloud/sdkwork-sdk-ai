using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class SpeechRequest
    {
        public string? Model { get; set; }
        public string? Input { get; set; }
        public string? Voice { get; set; }
        public double? Speed { get; set; }
        public Dictionary<string, object>? Extra { get; set; }
        public string? ResponseFormat { get; set; }
    }
}
