/** JSON Schema配置 */
export interface JsonSchema {
  /** JSON结构名称 */
  name?: string;
  /** 描述 */
  description?: string;
  /** JSON Schema对象 */
  schema?: unknown;
  /** 是否严格遵循 */
  strict?: boolean;
}
