import type { AudioParameters } from './audio-parameters';
import type { ChatMessage } from './chat-message';
import type { ResponseFormat } from './response-format';
import type { StreamOptions } from './stream-options';
import type { Thinking } from './thinking';
import type { Tool } from './tool';

/** Chat completion request */
export interface ChatCompletionRequest {
  /** 模型ID或接入点ID */
  model: string;
  /** 消息列表 */
  messages: ChatMessage[];
  /** 采样温度，取值范围[0, 2] */
  temperature?: number;
  /** 生成的对话回复数量 */
  n?: number;
  /** 是否流式返回 */
  stream?: boolean;
  /** 停止生成的字符串列表，最多4个 */
  stop?: string[];
  /** 用户标识 */
  user?: string;
  /** 待调用工具列表 */
  tools?: Tool[];
  /** 随机种子 */
  seed?: number;
  /** 响应模态列表 */
  modalities?: string[];
  /** 音频输出参数 */
  audio?: AudioParameters;
  /** 是否存储输出 */
  store?: boolean;
  /** 元数据 */
  metadata?: Record<string, string>;
  /** 思考模式配置 */
  thinking?: Thinking;
  /** 核采样概率阈值，取值范围[0, 1] */
  top_p?: number;
  /** 模型回答最大长度（单位token） */
  max_tokens?: number;
  /** 控制模型输出的最大长度（包括思维链） */
  max_completion_tokens?: number;
  /** 存在惩罚系数，取值范围[-2.0, 2.0] */
  presence_penalty?: number;
  /** 频率惩罚系数，取值范围[-2.0, 2.0] */
  frequency_penalty?: number;
  /** 调整指定token出现的概率 */
  logit_bias?: Record<string, number>;
  /** 指定模型回答格式 */
  response_format?: ResponseFormat;
  /** 控制模型返回是否包含待调用的工具 */
  tool_choice?: unknown;
  /** 控制是否使用TPM保障包 */
  service_tier?: 'auto' | 'default';
  /** 流式响应选项 */
  stream_options?: StreamOptions;
  /** 限制思考的工作量 */
  reasoning_effort?: 'minimal' | 'low' | 'medium' | 'high';
  /** 是否允许返回多个待调用的工具 */
  parallel_tool_calls?: boolean;
  /** 是否返回输出tokens的对数概率 */
  logprobs?: boolean;
  /** 每个位置最可能返回的token数量，取值范围[0, 20] */
  top_logprobs?: number;
}
