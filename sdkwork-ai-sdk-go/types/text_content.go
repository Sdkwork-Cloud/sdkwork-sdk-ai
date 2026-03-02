package types

// Text content payload
type TextContent struct {
	Value string `json:"value"`
	Annotations []interface{} `json:"annotations"`
}
