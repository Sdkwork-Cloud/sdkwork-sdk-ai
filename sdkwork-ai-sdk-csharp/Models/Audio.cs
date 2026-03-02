using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Audio
    {
        public string? Id { get; set; }
        public string? Data { get; set; }
        public string? Transcript { get; set; }
        public int? ExpiresAt { get; set; }
    }
}
