using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class RequestCounts
    {
        public int? Total { get; set; }
        public int? Completed { get; set; }
        public int? Failed { get; set; }
    }
}
