export interface CreateImageEditRequest {
  /** Image file for editing */
  image?: string[];
  'image[]'?: string[];
  /** Mask image file */
  mask?: string;
}
