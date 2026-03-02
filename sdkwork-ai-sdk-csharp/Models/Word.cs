using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Word
    {
        public string? Word { get; set; }
        public double? Start { get; set; }
        public double? End { get; set; }
    }
}
