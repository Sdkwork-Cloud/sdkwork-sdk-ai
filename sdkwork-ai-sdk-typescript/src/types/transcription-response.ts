import type { Segment } from './segment';
import type { Word } from './word';

export interface TranscriptionResponse {
  text?: string;
  task?: string;
  language?: string;
  duration?: number;
  words?: Word[];
  segments?: Segment[];
}
