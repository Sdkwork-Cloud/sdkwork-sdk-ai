using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ResponseFormat
    {
        public string? Type { get; set; }
        public JsonSchema? JsonSchema { get; set; }
    }
}
