# sdkwork-ai-sdk

Professional TypeScript SDK for SDKWork API.

## Installation

```bash
npm install @sdkwork/ai-sdk
# or
yarn add @sdkwork/ai-sdk
# or
pnpm add @sdkwork/ai-sdk
```

## Quick Start

```typescript
import { SdkworkAiClient } from '@sdkwork/ai-sdk';

const client = new SdkworkAiClient({
  baseUrl: 'http://localhost:8080',
  timeout: 30000,
});

// Mode A: API Key (recommended for server-to-server calls)
client.setApiKey('your-api-key');

// Use the SDK
const result = await client.model.listModels();
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```typescript
const client = new SdkworkAiClient({ baseUrl: 'http://localhost:8080' });
client.setApiKey('your-api-key');
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```typescript
const client = new SdkworkAiClient({ baseUrl: 'http://localhost:8080' });
client.setAuthToken('your-auth-token');
client.setAccessToken('your-access-token');
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```typescript
import { SdkworkAiClient } from '@sdkwork/ai-sdk';

const client = new SdkworkAiClient({
  baseUrl: 'http://localhost:8080',
  timeout: 30000, // Request timeout in ms
  headers: {      // Custom headers
    'X-Custom-Header': 'value',
  },
});
```

## API Modules

- `client.open` - open API
- `client.chat` - chat API
- `client.video` - video API
- `client.thread` - thread API
- `client.response` - response API
- `client.rerank` - rerank API
- `client.music` - music API
- `client.moderation` - moderation API
- `client.message` - message API
- `client.knowledgeBase` - knowledge_base API
- `client.image` - image API
- `client.file` - file API
- `client.embedding` - embedding API
- `client.context` - context API
- `client.batch` - batch API
- `client.audio` - audio API
- `client.assistant` - assistant API
- `client.model` - model API

## Usage Examples

### open

```typescript
// GET /v1/open/i18n/options
const params = {} as Record<string, any>;
const result = await client.open.getOptions(params);
```

### chat

```typescript
// List chat completions
const params = {} as Record<string, any>;
const result = await client.chat.listCompletions(params);
```

### video

```typescript
// List videos
const params = {} as Record<string, any>;
const result = await client.video.listVideos(params);
```

### thread

```typescript
// Create thread
const body = {} as any;
const result = await client.thread.createThread(body);
```

### response

```typescript
// Create response
const body = {} as any;
const result = await client.response.createResponse(body);
```

### rerank

```typescript
// Rerank documents
const body = {} as any;
const result = await client.rerank.rerank(body);
```

### music

```typescript
// List music
const params = {} as Record<string, any>;
const result = await client.music.listMusic(params);
```

### moderation

```typescript
// Create moderation
const body = {} as any;
const result = await client.moderation.createModeration(body);
```

### message

```typescript
// Count Claude tokens
const body = {} as any;
const result = await client.message.countClaudeTokens(body);
```

### knowledge_base

```typescript
// List knowledge bases
const params = {} as Record<string, any>;
const result = await client.knowledgeBase.listKnowledgeBases(params);
```

### image

```typescript
// Create image
const body = {} as any;
const result = await client.image.createImage(body);
```

### file

```typescript
// List files
const params = {} as Record<string, any>;
const result = await client.file.listFiles(params);
```

### embedding

```typescript
// Create embeddings
const body = {} as any;
const result = await client.embedding.createEmbedding(body);
```

### context

```typescript
// Create context
const body = {} as any;
const result = await client.context.createContext(body);
```

### batch

```typescript
// List batches
const params = {} as Record<string, any>;
const result = await client.batch.listBatches(params);
```

### audio

```typescript
// Create speech
const body = {} as any;
const result = await client.audio.createSpeech(body);
```

### assistant

```typescript
// List assistants
const params = {} as Record<string, any>;
const result = await client.assistant.listAssistants(params);
```

### model

```typescript
// List models
const result = await client.model.listModels();
```

## Error Handling

```typescript
import { SdkworkAiClient, NetworkError, TimeoutError, AuthenticationError } from '@sdkwork/ai-sdk';

try {
  const result = await client.model.listModels();
} catch (error) {
  if (error instanceof AuthenticationError) {
    console.error('Authentication failed:', error.message);
  } else if (error instanceof TimeoutError) {
    console.error('Request timed out:', error.message);
  } else if (error instanceof NetworkError) {
    console.error('Network error:', error.message);
  } else {
    throw error;
  }
}
```

## Publishing

This SDK includes cross-platform publish scripts in `bin/`:
- `bin/publish-core.mjs`
- `bin/publish.sh`
- `bin/publish.ps1`

### Check

```bash
./bin/publish.sh --action check
```

### Publish

```bash
./bin/publish.sh --action publish --channel release
```

```powershell
.\bin\publish.ps1 --action publish --channel test --dry-run
```

> Set `NPM_TOKEN` (and optional `NPM_REGISTRY_URL`) before release publish.

## License

MIT
