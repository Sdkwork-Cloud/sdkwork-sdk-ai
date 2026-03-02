package types

// 切片配置
type ChunkConfig struct {
	Separator string `json:"separator"`
	ChunkSize int `json:"chunk_size"`
	ChunkOverlap int `json:"chunk_overlap"`
}
