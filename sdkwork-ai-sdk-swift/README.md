# sdkwork-ai-sdk (Swift)

Professional Swift SDK for SDKWork API.

## Installation

Add to `Package.swift`:

```swift
dependencies: [
    .package(url: "https://github.com/sdkwork/ai-sdk-swift", from: "1.0.8")
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
let result = try await client.open.options()
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

```swift
// GET /v1/open/i18n/options
let result = try await client.open.options()
print(result)
```

### chat

```swift
// Get chat completion
let result = try await client.chat.getCompletion()
print(result)
```

### video

```swift
// List videos
let result = try await client.video.listVideos()
print(result)
```

### thread

```swift
// Submit tool outputs
let result = try await client.thread.submitToolOutputs()
print(result)
```

### response

```swift
// Cancel response
let result = try await client.response.cancel()
print(result)
```

### rerank

```swift
// Rerank documents
let result = try await client.rerank.rerank()
print(result)
```

### music

```swift
// Generate music
let result = try await client.music.generate()
print(result)
```

### moderation

```swift
// Create moderation
let result = try await client.moderation.createModeration()
print(result)
```

### message

```swift
// Count Claude tokens
let result = try await client.message.countClaudeTokens()
print(result)
```

### knowledge_base

```swift
// List documents
let result = try await client.knowledgeBase.listDocuments()
print(result)
```

### image

```swift
// Create image variation
let result = try await client.image.createImageVariation()
print(result)
```

### file

```swift
// List files
let result = try await client.file.listFiles()
print(result)
```

### embedding

```swift
// Create embeddings
let result = try await client.embedding.createEmbedding()
print(result)
```

### context

```swift
// Chat with context
let result = try await client.context.chatWith()
print(result)
```

### batch

```swift
// Cancel batch
let result = try await client.batch.cancel()
print(result)
```

### audio

```swift
// Create translation
let result = try await client.audio.createTranslation()
print(result)
```

### assistant

```swift
// Get assistant
let result = try await client.assistant.getAssistant()
print(result)
```

### model

```swift
// Retrieve model
let result = try await client.model.retrieve()
print(result)
```

## Error Handling

```swift
do {
    let result = try await client.open.options()
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
