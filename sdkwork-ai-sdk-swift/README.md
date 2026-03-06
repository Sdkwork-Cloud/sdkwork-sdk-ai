# sdkwork-ai-sdk (Swift)

Professional Swift SDK for SDKWork API.

## Installation

Add to `Package.swift`:

```swift
dependencies: [
    .package(url: "https://github.com/sdkwork/ai-sdk-swift", from: "1.0.0")
]
```

## Quick Start

```swift
import SdkworkAi
import SDKworkCommon

let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkAiClient(config: config)
client.setApiKey("your-api-key")

// Use the SDK
let result = try await client.i18nResource.options()
print(result)
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```swift
let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkAiClient(config: config)
client.setApiKey("your-api-key")
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```swift
let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkAiClient(config: config)
client.setAuthToken("your-auth-token")
client.setAccessToken("your-access-token")
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```swift
let config = SdkConfig(baseUrl: "http://localhost:8080")
let client = SdkworkAiClient(config: config)

// Set custom headers
client.setHeader("X-Custom-Header", value: "value")
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

```swift
// GET /v1/open/i18n/options
let result = try await client.i18nResource.options()
print(result)
```

### Chat

```swift
// Get chat completion
let result = try await client.chat.getCompletion()
print(result)
```

### chat

```swift
// Get chat completion
let result = try await client.chat2.getCompletion()
print(result)
```

### videos

```swift
// List videos
let result = try await client.videos.listVideos()
print(result)
```

### Videos

```swift
// List videos
let result = try await client.videos2.listVideos()
print(result)
```

### Threads

```swift
// Submit tool outputs
let result = try await client.threads.submitToolOutputs()
print(result)
```

### threads

```swift
// Submit tool outputs
let result = try await client.threads2.submitToolOutputs()
print(result)
```

### responses

```swift
// Cancel response
let result = try await client.responses.cancelResponse()
print(result)
```

### Responses

```swift
// Cancel response
let result = try await client.responses2.cancelResponse()
print(result)
```

### rerank

```swift
// Rerank documents
let result = try await client.rerank.rerank()
print(result)
```

### Rerank

```swift
// Rerank documents
let result = try await client.rerank2.rerank()
print(result)
```

### Music

```swift
// Generate music
let result = try await client.music.generate()
print(result)
```

### music

```swift
// Generate music
let result = try await client.music2.generate()
print(result)
```

### Moderations

```swift
// Create moderation
let result = try await client.moderations.createModeration()
print(result)
```

### moderations

```swift
// Create moderation
let result = try await client.moderations2.createModeration()
print(result)
```

### chat_completions

```swift
// Get chat completion
let result = try await client.chatCompletions.getChatCompletion()
print(result)
```

### Chat Completions Management

```swift
// Get chat completion
let result = try await client.chatCompletions2.getChatCompletion()
print(result)
```

### Knowledge Bases

```swift
// List documents
let result = try await client.knowledgeBases.listDocuments()
print(result)
```

### knowledge_bases

```swift
// List documents
let result = try await client.knowledgeBases2.listDocuments()
print(result)
```

### images

```swift
// Create image variation
let result = try await client.images.createImageVariation()
print(result)
```

### Images

```swift
// Create image variation
let result = try await client.images2.createImageVariation()
print(result)
```

### files

```swift
// List files
let result = try await client.files.listFiles()
print(result)
```

### Files

```swift
// List files
let result = try await client.files2.listFiles()
print(result)
```

### Embeddings

```swift
// Create embeddings
let result = try await client.embeddings.createEmbedding()
print(result)
```

### embeddings

```swift
// Create embeddings
let result = try await client.embeddings2.createEmbedding()
print(result)
```

### context

```swift
// Chat with context
let result = try await client.context.chatWith()
print(result)
```

### Context

```swift
// Chat with context
let result = try await client.context2.chatWith()
print(result)
```

### batches

```swift
// Cancel batch
let result = try await client.batches.cancelBatch()
print(result)
```

### Batches

```swift
// Cancel batch
let result = try await client.batches2.cancelBatch()
print(result)
```

### audio

```swift
// Create translation
let result = try await client.audio.createTranslation()
print(result)
```

### Audio

```swift
// Create translation
let result = try await client.audio2.createTranslation()
print(result)
```

### Assistants

```swift
// Get assistant
let result = try await client.assistants.getAssistant()
print(result)
```

### assistants

```swift
// Get assistant
let result = try await client.assistants2.getAssistant()
print(result)
```

### models

```swift
// Retrieve model
let result = try await client.models.retrieveModel()
print(result)
```

### Models

```swift
// Retrieve model
let result = try await client.models2.retrieveModel()
print(result)
```

## Error Handling

```swift
do {
    let result = try await client.i18nResource.options()
} catch {
    print("Error: \(error)")
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

> Set `SWIFT_RELEASE_TAG` (or `SDKWORK_RELEASE_TAG`) for tag-based release.

## License

MIT
