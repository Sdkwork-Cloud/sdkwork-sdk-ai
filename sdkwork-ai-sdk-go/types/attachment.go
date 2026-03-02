package types

// 附件
type Attachment struct {
	Tools []map[string]interface{} `json:"tools"`
	FileId string `json:"file_id"`
}
