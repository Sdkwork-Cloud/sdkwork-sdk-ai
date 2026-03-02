package types

// Suno音乐列表对象
type SunoMusicList struct {
	Object string `json:"object"`
	Data []SunoMusic `json:"data"`
}
