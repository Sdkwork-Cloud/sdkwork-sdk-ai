package types

// Message content block
type ContentBlock struct {
	Type string `json:"type"`
	Text TextContent `json:"text"`
	ImageFile ImageFileContent `json:"image_file"`
}
