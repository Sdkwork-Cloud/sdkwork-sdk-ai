using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ThreadMessageCreateRequest
    {
        public string? Role { get; set; }
        public object? Content { get; set; }
        public List<Attachment>? Attachments { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
    }
}
