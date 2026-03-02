using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ErrorObject
    {
        public string? Code { get; set; }
        public string? Message { get; set; }
        public int? Line { get; set; }
        public string? Param { get; set; }
    }
}
