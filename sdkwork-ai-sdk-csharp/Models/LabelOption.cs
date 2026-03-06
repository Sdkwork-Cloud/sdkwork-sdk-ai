using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class LabelOption
    {
        public string? Label { get; set; }
        public string? Value { get; set; }
        public string? Description { get; set; }
    }
}
