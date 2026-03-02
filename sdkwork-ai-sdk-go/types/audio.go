package types

// Audio response data
type Audio struct {
	Id string `json:"id"`
	Data string `json:"data"`
	Transcript string `json:"transcript"`
	ExpiresAt int `json:"expires_at"`
}
