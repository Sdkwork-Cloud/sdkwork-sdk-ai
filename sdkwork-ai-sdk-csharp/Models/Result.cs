using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Result
    {
        public int? Index { get; set; }
        public double? Score { get; set; }
        public string? Document { get; set; }
    }
}
