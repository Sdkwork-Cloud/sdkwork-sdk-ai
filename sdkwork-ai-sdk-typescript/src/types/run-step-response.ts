/** OpenAI run step object */
export interface RunStepResponse {
  /** Run step id */
  id?: string;
  /** Object type */
  object?: string;
  /** Step type */
  type?: string;
  /** Step status */
  status?: string;
  /** Metadata */
  metadata?: Record<string, string>;
  /** Unix timestamp */
  created_at?: number;
  /** Assistant id */
  assistant_id?: string;
  /** Thread id */
  thread_id?: string;
  /** Run id */
  run_id?: string;
  /** Step details */
  step_details?: unknown;
  /** Last error */
  last_error?: unknown;
  /** Expired timestamp */
  expired_at?: number;
  /** Cancelled timestamp */
  cancelled_at?: number;
  /** Failed timestamp */
  failed_at?: number;
  /** Completed timestamp */
  completed_at?: number;
}
