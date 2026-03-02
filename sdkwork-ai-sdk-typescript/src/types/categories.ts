/** Categories */
export interface Categories {
  /** Content that expresses, incites, or promotes hate based on protected characteristics */
  hate?: boolean;
  /** Content meant to arouse sexual excitement */
  sexual?: boolean;
  /** Content that depicts death, violence, or physical injury */
  violence?: boolean;
  /** Hateful content that also includes violence or serious harm */
  'hate/threatening'?: boolean;
  /** Content that promotes, encourages, or depicts acts of self-harm */
  'self-harm'?: boolean;
  /** Sexual content that includes minors */
  'sexual/minors'?: boolean;
  /** Violent content that depicts death, violence, or serious physical injury */
  'violence/graphic'?: boolean;
  /** Content that promotes or encourages illegal acts */
  'illegal-act'?: boolean;
  /** Content that provides instructions on how to make or use illegal items */
  'illegal-act/instruction'?: boolean;
}
