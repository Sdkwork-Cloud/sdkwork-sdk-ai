using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Logprobs
    {
        public List<Content>? Content { get; set; }
        public List<Content>? Refusal { get; set; }
    }
}
