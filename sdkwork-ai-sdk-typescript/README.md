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
const result = await client.models.listModels();
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

- `client.i18nResource` - i-18n-resource-controller API
- `client.chat` - Chat API
- `client.chat2` - chat API
- `client.videos` - videos API
- `client.videos2` - Videos API
- `client.threads` - Threads API
- `client.threads2` - threads API
- `client.responses` - responses API
- `client.responses2` - Responses API
- `client.rerank` - rerank API
- `client.rerank2` - Rerank API
- `client.music` - Music API
- `client.music2` - music API
- `client.moderations` - Moderations API
- `client.moderations2` - moderations API
- `client.chatCompletions` - chat_completions API
- `client.chatCompletions2` - Chat Completions Management API
- `client.knowledgeBases` - Knowledge Bases API
- `client.knowledgeBases2` - knowledge_bases API
- `client.images` - images API
- `client.images2` - Images API
- `client.files` - files API
- `client.files2` - Files API
- `client.embeddings` - Embeddings API
- `client.embeddings2` - embeddings API
- `client.context` - context API
- `client.context2` - Context API
- `client.batches` - batches API
- `client.batches2` - Batches API
- `client.audio` - audio API
- `client.audio2` - Audio API
- `client.assistants` - Assistants API
- `client.assistants2` - assistants API
- `client.models` - models API
- `client.models2` - Models API

## Usage Examples

### i-18n-resource-controller

```typescript
// GET /v1/open/i18n/options
const params = {} as Record<string, any>;
const result = await client.i18nResource.getOptions(params);
```

### Chat

```typescript
// List chat completions
const params = {} as Record<string, any>;
const result = await client.chat.listCompletions(params);
```

### chat

```typescript
// List chat completions
const params = {} as Record<string, any>;
const result = await client.chat2.listCompletions(params);
```

### videos

```typescript
// List videos
const params = {} as Record<string, any>;
const result = await client.videos.listVideos(params);
```

### Videos

```typescript
// List videos
const params = {} as Record<string, any>;
const result = await client.videos2.listVideos(params);
```

### Threads

```typescript
// Get thread
const thread_id = 1;
const result = await client.threads.getThread(thread_id);
```

### threads

```typescript
// Get thread
const thread_id = 1;
const result = await client.threads2.getThread(thread_id);
```

### responses

```typescript
// Create response
const body = {} as any;
const result = await client.responses.createResponse(body);
```

### Responses

```typescript
// Create response
const body = {} as any;
const result = await client.responses2.createResponse(body);
```

### rerank

```typescript
// Rerank documents
const body = {} as any;
const result = await client.rerank.rerank(body);
```

### Rerank

```typescript
// Rerank documents
const body = {} as any;
const result = await client.rerank2.rerank(body);
```

### Music

```typescript
// List music
const params = {} as Record<string, any>;
const result = await client.music.listMusic(params);
```

### music

```typescript
// List music
const params = {} as Record<string, any>;
const result = await client.music2.listMusic(params);
```

### Moderations

```typescript
// Create moderation
const body = {} as any;
const result = await client.moderations.createModeration(body);
```

### moderations

```typescript
// Create moderation
const body = {} as any;
const result = await client.moderations2.createModeration(body);
```

### chat_completions

```typescript
// List chat completions
const params = {} as Record<string, any>;
const result = await client.chatCompletions.listChatCompletions(params);
```

### Chat Completions Management

```typescript
// List chat completions
const params = {} as Record<string, any>;
const result = await client.chatCompletions2.listChatCompletions(params);
```

### Knowledge Bases

```typescript
// List knowledge bases
const params = {} as Record<string, any>;
const result = await client.knowledgeBases.listKnowledgeBases(params);
```

### knowledge_bases

```typescript
// List knowledge bases
const params = {} as Record<string, any>;
const result = await client.knowledgeBases2.listKnowledgeBases(params);
```

### images

```typescript
// Create image
const body = {} as any;
const result = await client.images.createImage(body);
```

### Images

```typescript
// Create image
const body = {} as any;
const result = await client.images2.createImage(body);
```

### files

```typescript
// List files
const params = {} as Record<string, any>;
const result = await client.files.listFiles(params);
```

### Files

```typescript
// List files
const params = {} as Record<string, any>;
const result = await client.files2.listFiles(params);
```

### Embeddings

```typescript
// Create embeddings
const body = {} as any;
const result = await client.embeddings.createEmbedding(body);
```

### embeddings

```typescript
// Create embeddings
const body = {} as any;
const result = await client.embeddings2.createEmbedding(body);
```

### context

```typescript
// Create context
const body = {} as any;
const result = await client.context.createContext(body);
```

### Context

```typescript
// Create context
const body = {} as any;
const result = await client.context2.createContext(body);
```

### batches

```typescript
// List batches
const params = {} as Record<string, any>;
const result = await client.batches.listBatches(params);
```

### Batches

```typescript
// List batches
const params = {} as Record<string, any>;
const result = await client.batches2.listBatches(params);
```

### audio

```typescript
// Create speech
const body = {} as any;
const result = await client.audio.createSpeech(body);
```

### Audio

```typescript
// Create speech
const body = {} as any;
const result = await client.audio2.createSpeech(body);
```

### Assistants

```typescript
// List assistants
const params = {} as Record<string, any>;
const result = await client.assistants.listAssistants(params);
```

### assistants

```typescript
// List assistants
const params = {} as Record<string, any>;
const result = await client.assistants2.listAssistants(params);
```

### models

```typescript
// List models
const result = await client.models.listModels();
```

### Models

```typescript
// List models
const result = await client.models2.listModels();
```

## Error Handling

```typescript
import { SdkworkAiClient, NetworkError, TimeoutError, AuthenticationError } from '@sdkwork/ai-sdk';

try {
  const result = await client.models.listModels();
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
