using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ThreadMessageResponse
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public string? Role { get; set; }
        public string? Status { get; set; }
        public List<ContentBlock>? Content { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public int? CreatedAt { get; set; }
        public string? ThreadId { get; set; }
        public object? IncompleteDetails { get; set; }
        public int? CompletedAt { get; set; }
        public int? IncompleteAt { get; set; }
        public string? AssistantId { get; set; }
        public string? RunId { get; set; }
        public List<string>? FileIds { get; set; }
    }
}
