package types

// Batch creation request
type BatchCreateRequest struct {
	Endpoint string `json:"endpoint"`
	Metadata map[string]string `json:"metadata"`
	InputFileId string `json:"input_file_id"`
	CompletionWindow string `json:"completion_window"`
}
