package types

// 批量任务响应
type BatchResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Endpoint string `json:"endpoint"`
	Errors Errors `json:"errors"`
	Status string `json:"status"`
	Metadata map[string]string `json:"metadata"`
	InputFileId string `json:"input_file_id"`
	OutputFileId string `json:"output_file_id"`
	ErrorFileId string `json:"error_file_id"`
	CreatedAt int `json:"created_at"`
	CompletionWindow string `json:"completion_window"`
	ExpiresAt int `json:"expires_at"`
	StartedAt int `json:"started_at"`
	CompletedAt int `json:"completed_at"`
	FailedAt int `json:"failed_at"`
	ExpiredAt int `json:"expired_at"`
	CancelledAt int `json:"cancelled_at"`
	RequestCounts RequestCounts `json:"request_counts"`
}
