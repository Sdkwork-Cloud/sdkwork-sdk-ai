using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class RunStepResponse
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public int? CreatedAt { get; set; }
        public string? AssistantId { get; set; }
        public string? ThreadId { get; set; }
        public string? RunId { get; set; }
        public object? StepDetails { get; set; }
        public object? LastError { get; set; }
        public int? ExpiredAt { get; set; }
        public int? CancelledAt { get; set; }
        public int? FailedAt { get; set; }
        public int? CompletedAt { get; set; }
    }
}
