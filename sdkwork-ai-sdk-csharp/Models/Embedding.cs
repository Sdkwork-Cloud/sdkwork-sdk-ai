using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Embedding
    {
        public string? Object { get; set; }
        public List<double>? Embedding { get; set; }
        public int? Index { get; set; }
    }
}
