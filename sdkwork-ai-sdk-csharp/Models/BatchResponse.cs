using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class BatchResponse
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public string? Endpoint { get; set; }
        public Errors? Errors { get; set; }
        public string? Status { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public string? InputFileId { get; set; }
        public string? OutputFileId { get; set; }
        public string? ErrorFileId { get; set; }
        public int? CreatedAt { get; set; }
        public string? CompletionWindow { get; set; }
        public int? ExpiresAt { get; set; }
        public int? StartedAt { get; set; }
        public int? CompletedAt { get; set; }
        public int? FailedAt { get; set; }
        public int? ExpiredAt { get; set; }
        public int? CancelledAt { get; set; }
        public RequestCounts? RequestCounts { get; set; }
    }
}
