using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class OpenAiVideo
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public string? Model { get; set; }
        public string? Status { get; set; }
        public int? Progress { get; set; }
        public string? Prompt { get; set; }
        public string? Seconds { get; set; }
        public string? Size { get; set; }
        public string? Quality { get; set; }
        public VideoError? Error { get; set; }
        public int? CreatedAt { get; set; }
        public int? CompletedAt { get; set; }
        public int? ExpiresAt { get; set; }
        public string? OutputUrl { get; set; }
        public string? RemixedFromVideoId { get; set; }
    }
}
