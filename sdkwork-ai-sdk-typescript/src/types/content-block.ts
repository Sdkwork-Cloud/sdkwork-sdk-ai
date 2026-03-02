import type { ImageFileContent } from './image-file-content';
import type { TextContent } from './text-content';

/** Message content block */
export interface ContentBlock {
  /** Content block type */
  type?: string;
  /** Text payload */
  text?: TextContent;
  /** Image file payload */
  image_file?: ImageFileContent;
}
