package types

// Suno音乐对象
type SunoMusic struct {
	Id string `json:"id"`
	Object string `json:"object"`
	Title string `json:"title"`
	Status string `json:"status"`
	Duration int `json:"duration"`
	Tags []string `json:"tags"`
	Genre string `json:"genre"`
	AudioUrl string `json:"audioUrl"`
	Lyrics string `json:"lyrics"`
	Instrumental bool `json:"instrumental"`
	Error MusicError `json:"error"`
	CreatedAt int `json:"created_at"`
	CompletedAt int `json:"completed_at"`
}
