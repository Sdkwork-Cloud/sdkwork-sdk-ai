import type { Function } from './function';

/** 工具定义 */
export interface Tool {
  /** 工具类型 */
  type?: string;
  /** 函数定义 */
  function?: Function;
}
