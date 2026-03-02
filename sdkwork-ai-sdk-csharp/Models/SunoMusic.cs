using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class SunoMusic
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public string? Title { get; set; }
        public string? Status { get; set; }
        public int? Duration { get; set; }
        public List<string>? Tags { get; set; }
        public string? Genre { get; set; }
        public string? AudioUrl { get; set; }
        public string? Lyrics { get; set; }
        public bool? Instrumental { get; set; }
        public MusicError? Error { get; set; }
        public int? CreatedAt { get; set; }
        public int? CompletedAt { get; set; }
    }
}
