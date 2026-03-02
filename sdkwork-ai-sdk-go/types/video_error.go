package types

// Video error details
type VideoError struct {
	Code string `json:"code"`
	Message string `json:"message"`
	Type string `json:"type"`
	Param string `json:"param"`
}
