using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class CreateImageEditRequest
    {
        public List<string>? Image { get; set; }
        public List<string>? Image { get; set; }
        public string? Mask { get; set; }
    }
}
