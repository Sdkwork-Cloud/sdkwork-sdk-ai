using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ChunkConfig
    {
        public string? Separator { get; set; }
        public int? ChunkSize { get; set; }
        public int? ChunkOverlap { get; set; }
    }
}
