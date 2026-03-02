using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class RerankResponse
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public string? Model { get; set; }
        public List<Result>? Results { get; set; }
        public Usage? Usage { get; set; }
    }
}
