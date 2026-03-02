package types


type OpenAiModelList struct {
	Object string `json:"object"`
	Data []OpenAiModel `json:"data"`
}
