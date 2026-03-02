using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ModerationRequest
    {
        public string? Model { get; set; }
        public object? Input { get; set; }
        public string? User { get; set; }
    }
}
