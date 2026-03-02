using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Filter
    {
        public string? Field { get; set; }
        public string? Op { get; set; }
        public object? Value { get; set; }
    }
}
