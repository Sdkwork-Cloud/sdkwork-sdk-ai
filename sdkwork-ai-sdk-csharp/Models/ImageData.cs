using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ImageData
    {
        public string? Url { get; set; }
        public string? B64Json { get; set; }
        public string? RevisedPrompt { get; set; }
    }
}
