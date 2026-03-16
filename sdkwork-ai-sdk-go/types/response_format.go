package types

// 响应格式配置
type ResponseFormat struct {
	Type string `json:"type"`
	JsonSchema JsonSchema `json:"json_schema"`
}
