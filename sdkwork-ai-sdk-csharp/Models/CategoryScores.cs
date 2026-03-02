using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class CategoryScores
    {
        public double? Hate { get; set; }
        public double? Sexual { get; set; }
        public double? Violence { get; set; }
        public double? HateThreatening { get; set; }
        public double? SelfHarm { get; set; }
        public double? SexualMinors { get; set; }
        public double? ViolenceGraphic { get; set; }
        public double? IllegalAct { get; set; }
        public double? IllegalActInstruction { get; set; }
    }
}
