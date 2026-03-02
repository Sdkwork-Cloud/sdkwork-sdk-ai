using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class OpenAiVideoList
    {
        public string? Object { get; set; }
        public List<OpenAiVideo>? Data { get; set; }
    }
}
