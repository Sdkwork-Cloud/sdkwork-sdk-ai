import type { FileCitation } from './file-citation';

/** Annotation */
export interface Annotation {
  /** The type of annotation */
  type?: string;
  /** The text in the message content that needs to be replaced */
  text?: string;
  /** File citation details */
  file_citation?: FileCitation;
}
