using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Attachment
    {
        public List<Dictionary<string, object>>? Tools { get; set; }
        public string? FileId { get; set; }
    }
}
