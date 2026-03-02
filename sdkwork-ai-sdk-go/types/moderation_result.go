package types

// Moderation result for a single input
type ModerationResult struct {
	Flagged bool `json:"flagged"`
	Categories Categories `json:"categories"`
	CategoryScores CategoryScores `json:"category_scores"`
}
