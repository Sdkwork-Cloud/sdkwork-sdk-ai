using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ChatCompletionList
    {
        public string? Object { get; set; }
        public List<ChatCompletionResponse>? Data { get; set; }
        public bool? HasMore { get; set; }
        public string? FirstId { get; set; }
        public string? LastId { get; set; }
    }
}
