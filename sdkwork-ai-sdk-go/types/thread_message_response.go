package types

// OpenAI thread message object
type ThreadMessageResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Role string `json:"role"`
	Status string `json:"status"`
	Content []ContentBlock `json:"content"`
	Metadata map[string]string `json:"metadata"`
	CreatedAt int `json:"created_at"`
	ThreadId string `json:"thread_id"`
	IncompleteDetails interface{} `json:"incomplete_details"`
	CompletedAt int `json:"completed_at"`
	IncompleteAt int `json:"incomplete_at"`
	AssistantId string `json:"assistant_id"`
	RunId string `json:"run_id"`
	FileIds []string `json:"file_ids"`
}
