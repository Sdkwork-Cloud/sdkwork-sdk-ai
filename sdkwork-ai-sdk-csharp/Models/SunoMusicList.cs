using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Ai.Models
{
    public class SunoMusicList
    {
        public string? Object { get; set; }
        public List<SunoMusic>? Data { get; set; }
    }
}
