package types

// Categories
type Categories struct {
	Hate bool `json:"hate"`
	Sexual bool `json:"sexual"`
	Violence bool `json:"violence"`
	HateThreatening bool `json:"hate/threatening"`
	SelfHarm bool `json:"self-harm"`
	SexualMinors bool `json:"sexual/minors"`
	ViolenceGraphic bool `json:"violence/graphic"`
	IllegalAct bool `json:"illegal-act"`
	IllegalActInstruction bool `json:"illegal-act/instruction"`
}
