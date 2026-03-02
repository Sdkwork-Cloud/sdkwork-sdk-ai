package types

// 流式响应选项
type StreamOptions struct {
	IncludeUsage bool `json:"include_usage"`
	ChunkIncludeUsage bool `json:"chunk_include_usage"`
}
