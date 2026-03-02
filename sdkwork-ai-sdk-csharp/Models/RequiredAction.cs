using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class RequiredAction
    {
        public string? Type { get; set; }
        public SubmitToolOutputs? SubmitToolOutputs { get; set; }
    }
}
