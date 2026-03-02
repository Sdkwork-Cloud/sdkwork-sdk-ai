import type { OpenAiModel } from './open-ai-model';

export interface OpenAiModelList {
  object?: string;
  data?: OpenAiModel[];
}
