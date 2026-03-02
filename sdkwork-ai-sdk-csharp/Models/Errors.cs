using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Errors
    {
        public ErrorObject? Object { get; set; }
        public object? Data { get; set; }
    }
}
