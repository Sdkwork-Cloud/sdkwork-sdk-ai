package types

// Thread message request
type ThreadMessageCreateRequest struct {
	Role string `json:"role"`
	Content interface{} `json:"content"`
	Attachments []Attachment `json:"attachments"`
	Metadata map[string]string `json:"metadata"`
}
