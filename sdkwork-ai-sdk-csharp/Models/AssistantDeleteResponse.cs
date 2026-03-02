using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class AssistantDeleteResponse
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public bool? Deleted { get; set; }
    }
}
