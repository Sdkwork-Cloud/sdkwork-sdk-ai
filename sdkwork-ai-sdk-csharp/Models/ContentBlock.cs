using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ContentBlock
    {
        public string? Type { get; set; }
        public TextContent? Text { get; set; }
        public ImageFileContent? ImageFile { get; set; }
    }
}
