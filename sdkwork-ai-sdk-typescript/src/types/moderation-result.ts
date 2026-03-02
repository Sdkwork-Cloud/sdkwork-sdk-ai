import type { Categories } from './categories';
import type { CategoryScores } from './category-scores';

/** Moderation result for a single input */
export interface ModerationResult {
  /** Whether the content violates OpenAI's usage policies */
  flagged?: boolean;
  /** A list of the categories, and whether they are flagged or not */
  categories?: Categories;
  /** A list of the categories along with their scores as predicted by model */
  category_scores?: CategoryScores;
}
