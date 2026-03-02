using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class OpenAiModelList
    {
        public string? Object { get; set; }
        public List<OpenAiModel>? Data { get; set; }
    }
}
