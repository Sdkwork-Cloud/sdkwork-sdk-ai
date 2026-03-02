package types

// JSON Schema配置
type JsonSchema struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Schema interface{} `json:"schema"`
	Strict bool `json:"strict"`
}
