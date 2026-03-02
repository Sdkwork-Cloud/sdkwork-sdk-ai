using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class FunctionCall
    {
        public string? Name { get; set; }
        public string? Arguments { get; set; }
    }
}
