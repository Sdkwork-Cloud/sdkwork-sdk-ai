# sdkwork-ai-sdk (Kotlin)

Professional Kotlin SDK for SDKWork API.

## Installation

Add to your `build.gradle.kts`:

```kotlin
implementation("com.sdkwork:ai-sdk:1.0.8")
```

Or with Gradle Groovy:

```groovy
implementation 'com.sdkwork:ai-sdk:1.0.8'
```

## Quick Start

```kotlin
import com.sdkwork.ai.SdkworkAiClient
import com.sdkwork.common.core.SdkConfig

suspend fun main() {
    val config = SdkConfig(baseUrl = "http://localhost:8080")
    val client = SdkworkAiClient(config)
    client.setApiKey("your-api-key")
    
    // Use the SDK
    val result = client.open.options()
    println(result)
}
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```kotlin
val config = SdkConfig(baseUrl = "http://localhost:8080")
val client = SdkworkAiClient(config)
client.setApiKey("your-api-key")
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```kotlin
val config = SdkConfig(baseUrl = "http://localhost:8080")
val client = SdkworkAiClient(config)
client.setAuthToken("your-auth-token")
client.setAccessToken("your-access-token")
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```kotlin
val config = SdkConfig(baseUrl = "http://localhost:8080")
val client = SdkworkAiClient(config)
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

```kotlin
// GET /v1/open/i18n/options
val result = client.open.options()
println(result)
```

### chat

```kotlin
// Get chat completion
val result = client.chat.getCompletion()
println(result)
```

### video

```kotlin
// List videos
val result = client.video.listVideos()
println(result)
```

### thread

```kotlin
// Submit tool outputs
val result = client.thread.submitToolOutputs()
println(result)
```

### response

```kotlin
// Cancel response
val result = client.response.cancel()
println(result)
```

### rerank

```kotlin
// Rerank documents
val result = client.rerank.rerank()
println(result)
```

### music

```kotlin
// Generate music
val result = client.music.generate()
println(result)
```

### moderation

```kotlin
// Create moderation
val result = client.moderation.createModeration()
println(result)
```

### message

```kotlin
// Count Claude tokens
val result = client.message.countClaudeTokens()
println(result)
```

### knowledge_base

```kotlin
// List documents
val result = client.knowledgeBase.listDocuments()
println(result)
```

### image

```kotlin
// Create image variation
val result = client.image.createImageVariation()
println(result)
```

### file

```kotlin
// List files
val result = client.file.listFiles()
println(result)
```

### embedding

```kotlin
// Create embeddings
val result = client.embedding.createEmbedding()
println(result)
```

### context

```kotlin
// Chat with context
val result = client.context.chatWith()
println(result)
```

### batch

```kotlin
// Cancel batch
val result = client.batch.cancel()
println(result)
```

### audio

```kotlin
// Create translation
val result = client.audio.createTranslation()
println(result)
```

### assistant

```kotlin
// Get assistant
val result = client.assistant.getAssistant()
println(result)
```

### model

```kotlin
// Retrieve model
val result = client.model.retrieve()
println(result)
```

## Error Handling

```kotlin
try {
    val result = client.open.options()
} catch (e: Exception) {
    println("Error: ${e.message}")
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

> Configure Gradle publishing credentials and optional `GRADLE_PUBLISH_TASK`.

## License

MIT
