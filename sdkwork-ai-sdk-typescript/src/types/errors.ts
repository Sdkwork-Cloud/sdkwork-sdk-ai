import type { ErrorObject } from './error-object';

/** 错误信息 */
export interface Errors {
  /** 错误对象 */
  object?: ErrorObject;
  /** 错误数据 */
  data?: unknown;
}
