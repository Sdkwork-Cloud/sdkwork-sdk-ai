using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Choice
    {
        public int? Index { get; set; }
        public Message? Message { get; set; }
        public Logprobs? Logprobs { get; set; }
        public string? FinishReason { get; set; }
        public string? ModerationHitType { get; set; }
    }
}
