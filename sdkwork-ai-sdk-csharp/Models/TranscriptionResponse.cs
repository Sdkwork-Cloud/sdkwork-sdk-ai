using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class TranscriptionResponse
    {
        public string? Text { get; set; }
        public string? Task { get; set; }
        public string? Language { get; set; }
        public double? Duration { get; set; }
        public List<Word>? Words { get; set; }
        public List<Segment>? Segments { get; set; }
    }
}
