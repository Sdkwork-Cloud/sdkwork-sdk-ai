using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class OpenAiFileObject
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public int? Bytes { get; set; }
        public string? Filename { get; set; }
        public string? Purpose { get; set; }
        public string? Status { get; set; }
        public bool? Deleted { get; set; }
        public int? CreatedAt { get; set; }
        public int? ExpiresAt { get; set; }
        public string? StatusDetails { get; set; }
    }
}
