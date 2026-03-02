using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Document
    {
        public string? Content { get; set; }
        public object? Metadata { get; set; }
    }
}
