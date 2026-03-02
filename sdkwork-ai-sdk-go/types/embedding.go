package types

// Embedding object
type Embedding struct {
	Object string `json:"object"`
	Embedding []float64 `json:"embedding"`
	Index int `json:"index"`
}
