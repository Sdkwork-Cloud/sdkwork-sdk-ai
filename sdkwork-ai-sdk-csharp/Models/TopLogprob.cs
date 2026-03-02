using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class TopLogprob
    {
        public string? Token { get; set; }
        public double? Logprob { get; set; }
        public List<int>? Bytes { get; set; }
    }
}
