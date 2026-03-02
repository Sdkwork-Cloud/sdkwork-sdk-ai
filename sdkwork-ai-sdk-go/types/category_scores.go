package types

// Category scores
type CategoryScores struct {
	Hate float64 `json:"hate"`
	Sexual float64 `json:"sexual"`
	Violence float64 `json:"violence"`
	HateThreatening float64 `json:"hate/threatening"`
	SelfHarm float64 `json:"self-harm"`
	SexualMinors float64 `json:"sexual/minors"`
	ViolenceGraphic float64 `json:"violence/graphic"`
	IllegalAct float64 `json:"illegal-act"`
	IllegalActInstruction float64 `json:"illegal-act/instruction"`
}
