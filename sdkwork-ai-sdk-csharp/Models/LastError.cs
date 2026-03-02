using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class LastError
    {
        public string? Code { get; set; }
        public string? Message { get; set; }
    }
}
