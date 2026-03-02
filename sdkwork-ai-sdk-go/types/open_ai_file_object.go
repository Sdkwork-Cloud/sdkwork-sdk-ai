package types

// OpenAI标准文件对象
type OpenAiFileObject struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Bytes int `json:"bytes"`
	Filename string `json:"filename"`
	Purpose string `json:"purpose"`
	Status string `json:"status"`
	Deleted bool `json:"deleted"`
	CreatedAt int `json:"created_at"`
	ExpiresAt int `json:"expires_at"`
	StatusDetails string `json:"status_details"`
}
