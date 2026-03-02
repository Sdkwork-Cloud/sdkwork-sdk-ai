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
let result = try await client.chat.listCompletions()
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

- `client.chat` - chat API
- `client.videos` - videos API
- `client.threads` - threads API
- `client.responses` - responses API
- `client.rerank` - rerank API
- `client.music` - music API
- `client.moderations` - moderations API
- `client.chatCompletions` - chat_completions API
- `client.knowledgeBases` - knowledge_bases API
- `client.images` - images API
- `client.files` - files API
- `client.embeddings` - embeddings API
- `client.context` - context API
- `client.batches` - batches API
- `client.audio` - audio API
- `client.assistants` - assistants API
- `client.models` - models API

## Usage Examples

### chat

```swift
// Get chat completion
let result = try await client.chat.getCompletion()
print(result)
```

### videos

```swift
// List videos
let result = try await client.videos.listVideos()
print(result)
```

### threads

```swift
// Submit tool outputs
let result = try await client.threads.submitToolOutputs()
print(result)
```

### responses

```swift
// Cancel response
let result = try await client.responses.cancelResponse()
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

### moderations

```swift
// Create moderation
let result = try await client.moderations.createModeration()
print(result)
```

### chat_completions

```swift
// Get chat completion
let result = try await client.chatCompletions.getChatCompletion()
print(result)
```

### knowledge_bases

```swift
// List documents
let result = try await client.knowledgeBases.listDocuments()
print(result)
```

### images

```swift
// Create image variation
let result = try await client.images.createImageVariation()
print(result)
```

### files

```swift
// List files
let result = try await client.files.listFiles()
print(result)
```

### embeddings

```swift
// Create embeddings
let result = try await client.embeddings.createEmbedding()
print(result)
```

### context

```swift
// Chat with context
let result = try await client.context.chatWith()
print(result)
```

### batches

```swift
// Cancel batch
let result = try await client.batches.cancelBatch()
print(result)
```

### audio

```swift
// Create translation
let result = try await client.audio.createTranslation()
print(result)
```

### assistants

```swift
// Get assistant
let result = try await client.assistants.getAssistant()
print(result)
```

### models

```swift
// Retrieve model
let result = try await client.models.retrieveModel()
print(result)
```

## Error Handling

```swift
do {
    let result = try await client.chat.listCompletions()
} catch {
    print("Error: \(error)")
}
```

## License

MIT
