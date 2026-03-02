using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ThreadCreateRequest
    {
        public List<Message>? Messages { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public Dictionary<string, object>? ToolResources { get; set; }
    }
}
