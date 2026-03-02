package types

// OpenAI标准聊天完成删除响应
type ChatCompletionDeleteResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Deleted bool `json:"deleted"`
}
