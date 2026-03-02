using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class StreamOptions
    {
        public bool? IncludeUsage { get; set; }
        public bool? ChunkIncludeUsage { get; set; }
    }
}
