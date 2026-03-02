package types

// OpenAI标准文件列表对象
type OpenAiFileList struct {
	Data []OpenAiFileObject `json:"data"`
	Object string `json:"object"`
	FirstId string `json:"first_id"`
	LastId string `json:"last_id"`
	HasMore bool `json:"has_more"`
}
