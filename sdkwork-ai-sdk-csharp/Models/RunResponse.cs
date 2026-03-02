using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class RunResponse
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public string? Status { get; set; }
        public string? Model { get; set; }
        public string? Instructions { get; set; }
        public List<object>? Tools { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public Usage? Usage { get; set; }
        public double? Temperature { get; set; }
        public int? CreatedAt { get; set; }
        public string? ThreadId { get; set; }
        public string? AssistantId { get; set; }
        public RequiredAction? RequiredAction { get; set; }
        public LastError? LastError { get; set; }
        public int? ExpiresAt { get; set; }
        public int? StartedAt { get; set; }
        public int? CancelledAt { get; set; }
        public int? FailedAt { get; set; }
        public int? CompletedAt { get; set; }
        public Dictionary<string, object>? ToolResources { get; set; }
        public double? TopP { get; set; }
        public int? MaxPromptTokens { get; set; }
        public int? MaxCompletionTokens { get; set; }
        public object? TruncationStrategy { get; set; }
    }
}
