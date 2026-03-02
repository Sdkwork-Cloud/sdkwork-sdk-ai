package types

// 错误对象
type ErrorObject struct {
	Code string `json:"code"`
	Message string `json:"message"`
	Line int `json:"line"`
	Param string `json:"param"`
}
