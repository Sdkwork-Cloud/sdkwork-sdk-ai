package types

// OpenAI run step object
type RunStepResponse struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Type string `json:"type"`
	Status string `json:"status"`
	Metadata map[string]string `json:"metadata"`
	CreatedAt int `json:"created_at"`
	AssistantId string `json:"assistant_id"`
	ThreadId string `json:"thread_id"`
	RunId string `json:"run_id"`
	StepDetails interface{} `json:"step_details"`
	LastError interface{} `json:"last_error"`
	ExpiredAt int `json:"expired_at"`
	CancelledAt int `json:"cancelled_at"`
	FailedAt int `json:"failed_at"`
	CompletedAt int `json:"completed_at"`
}
