package types

// Annotation
type Annotation struct {
	Type string `json:"type"`
	Text string `json:"text"`
	FileCitation FileCitation `json:"file_citation"`
}
