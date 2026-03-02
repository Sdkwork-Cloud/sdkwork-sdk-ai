using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class CompletionTokensDetails
    {
        public int? ReasoningTokens { get; set; }
        public int? AudioTokens { get; set; }
        public int? AcceptedPredictionTokens { get; set; }
        public int? RejectedPredictionTokens { get; set; }
    }
}
