using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Annotation
    {
        public string? Type { get; set; }
        public string? Text { get; set; }
        public FileCitation? FileCitation { get; set; }
    }
}
