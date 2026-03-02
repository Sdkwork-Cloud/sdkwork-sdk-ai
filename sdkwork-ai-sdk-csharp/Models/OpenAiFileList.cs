using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class OpenAiFileList
    {
        public List<OpenAiFileObject>? Data { get; set; }
        public string? Object { get; set; }
        public string? FirstId { get; set; }
        public string? LastId { get; set; }
        public bool? HasMore { get; set; }
    }
}
