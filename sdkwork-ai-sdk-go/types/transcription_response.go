package types


type TranscriptionResponse struct {
	Text string `json:"text"`
	Task string `json:"task"`
	Language string `json:"language"`
	Duration float64 `json:"duration"`
	Words []Word `json:"words"`
	Segments []Segment `json:"segments"`
}
