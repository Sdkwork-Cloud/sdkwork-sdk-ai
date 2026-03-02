package types


type ImageGenerationResponse struct {
	Created int `json:"created"`
	Data []ImageData `json:"data"`
}
