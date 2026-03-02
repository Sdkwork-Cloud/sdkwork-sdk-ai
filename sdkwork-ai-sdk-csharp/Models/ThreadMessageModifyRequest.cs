using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ThreadMessageModifyRequest
    {
        public Dictionary<string, string>? Metadata { get; set; }
    }
}
