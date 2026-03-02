import type { JsonSchema } from './json-schema';

/** 响应格式配置 */
export interface ResponseFormat {
  /** 格式类型 */
  type?: 'text' | 'json_object' | 'json_schema';
  /** JSON Schema定义 */
  jsonSchema?: JsonSchema;
}
