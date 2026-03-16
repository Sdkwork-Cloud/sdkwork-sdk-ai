using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ChatCompletionRequest
    {
        public string? Model { get; set; }
        public List<ChatMessage>? Messages { get; set; }
        public double? Temperature { get; set; }
        public int? N { get; set; }
        public bool? Stream { get; set; }
        public List<string>? Stop { get; set; }
        public string? User { get; set; }
        public List<Tool>? Tools { get; set; }
        public double? Seed { get; set; }
        public List<string>? Modalities { get; set; }
        public AudioParameters? Audio { get; set; }
        public bool? Store { get; set; }
        public Dictionary<string, string>? Metadata { get; set; }
        public Thinking? Thinking { get; set; }
        public double? TopP { get; set; }
        public int? MaxTokens { get; set; }
        public int? MaxCompletionTokens { get; set; }
        public double? PresencePenalty { get; set; }
        public double? FrequencyPenalty { get; set; }
        public Dictionary<string, int>? LogitBias { get; set; }
        public ResponseFormat? ResponseFormat { get; set; }
        public object? ToolChoice { get; set; }
        public string? ServiceTier { get; set; }
        public StreamOptions? StreamOptions { get; set; }
        public string? ReasoningEffort { get; set; }
        public bool? ParallelToolCalls { get; set; }
        public bool? Logprobs { get; set; }
        public int? TopLogprobs { get; set; }
    }
}
