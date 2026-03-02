using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ModerationResult
    {
        public bool? Flagged { get; set; }
        public Categories? Categories { get; set; }
        public CategoryScores? CategoryScores { get; set; }
    }
}
