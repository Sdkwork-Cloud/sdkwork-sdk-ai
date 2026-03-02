package types

// 过滤条件
type Filter struct {
	Field string `json:"field"`
	Op string `json:"op"`
	Value interface{} `json:"value"`
}
