using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class ImageGenerationResponse
    {
        public int? Created { get; set; }
        public List<ImageData>? Data { get; set; }
    }
}
