package types

// 错误信息
type Errors struct {
	Object ErrorObject `json:"object"`
	Data interface{} `json:"data"`
}
