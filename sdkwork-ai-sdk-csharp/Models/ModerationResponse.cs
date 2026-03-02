using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ModerationResponse
    {
        public string? Id { get; set; }
        public string? Model { get; set; }
        public List<ModerationResult>? Results { get; set; }
    }
}
