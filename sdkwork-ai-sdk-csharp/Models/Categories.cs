using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class Categories
    {
        public bool? Hate { get; set; }
        public bool? Sexual { get; set; }
        public bool? Violence { get; set; }
        public bool? HateThreatening { get; set; }
        public bool? SelfHarm { get; set; }
        public bool? SexualMinors { get; set; }
        public bool? ViolenceGraphic { get; set; }
        public bool? IllegalAct { get; set; }
        public bool? IllegalActInstruction { get; set; }
    }
}
