using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class TruncationStrategy
    {
        public string? Type { get; set; }
        public int? LastMessages { get; set; }
    }
}
