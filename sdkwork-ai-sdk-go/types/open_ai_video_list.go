package types


type OpenAiVideoList struct {
	Object string `json:"object"`
	Data []OpenAiVideo `json:"data"`
}
