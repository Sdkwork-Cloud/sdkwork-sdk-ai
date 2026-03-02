using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Usage
    {
        public int? PromptTokens { get; set; }
        public int? CompletionTokens { get; set; }
        public int? TotalTokens { get; set; }
        public PromptTokensDetails? PromptTokensDetails { get; set; }
        public CompletionTokensDetails? CompletionTokensDetails { get; set; }
    }
}
