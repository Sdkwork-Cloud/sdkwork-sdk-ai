package types


type CreateImageEditPostRequest struct {
	Image []string `json:"image"`
	Image []string `json:"image[]"`
	Mask string `json:"mask"`
}
