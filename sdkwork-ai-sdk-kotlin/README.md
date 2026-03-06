# sdkwork-ai-sdk (Kotlin)

Professional Kotlin SDK for SDKWork API.

## Installation

Add to your `build.gradle.kts`:

```kotlin
implementation("com.sdkwork:ai-sdk:1.0.0")
```

Or with Gradle Groovy:

```groovy
implementation 'com.sdkwork:ai-sdk:1.0.0'
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
    val result = client.i18nResource.options()
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

```kotlin
// GET /v1/open/i18n/options
val result = client.i18nResource.options()
println(result)
```

### Chat

```kotlin
// Get chat completion
val result = client.chat.getCompletion()
println(result)
```

### chat

```kotlin
// Get chat completion
val result = client.chat2.getCompletion()
println(result)
```

### videos

```kotlin
// List videos
val result = client.videos.listVideos()
println(result)
```

### Videos

```kotlin
// List videos
val result = client.videos2.listVideos()
println(result)
```

### Threads

```kotlin
// Submit tool outputs
val result = client.threads.submitToolOutputs()
println(result)
```

### threads

```kotlin
// Submit tool outputs
val result = client.threads2.submitToolOutputs()
println(result)
```

### responses

```kotlin
// Cancel response
val result = client.responses.cancelResponse()
println(result)
```

### Responses

```kotlin
// Cancel response
val result = client.responses2.cancelResponse()
println(result)
```

### rerank

```kotlin
// Rerank documents
val result = client.rerank.rerank()
println(result)
```

### Rerank

```kotlin
// Rerank documents
val result = client.rerank2.rerank()
println(result)
```

### Music

```kotlin
// Generate music
val result = client.music.generate()
println(result)
```

### music

```kotlin
// Generate music
val result = client.music2.generate()
println(result)
```

### Moderations

```kotlin
// Create moderation
val result = client.moderations.createModeration()
println(result)
```

### moderations

```kotlin
// Create moderation
val result = client.moderations2.createModeration()
println(result)
```

### chat_completions

```kotlin
// Get chat completion
val result = client.chatCompletions.getChatCompletion()
println(result)
```

### Chat Completions Management

```kotlin
// Get chat completion
val result = client.chatCompletions2.getChatCompletion()
println(result)
```

### Knowledge Bases

```kotlin
// List documents
val result = client.knowledgeBases.listDocuments()
println(result)
```

### knowledge_bases

```kotlin
// List documents
val result = client.knowledgeBases2.listDocuments()
println(result)
```

### images

```kotlin
// Create image variation
val result = client.images.createImageVariation()
println(result)
```

### Images

```kotlin
// Create image variation
val result = client.images2.createImageVariation()
println(result)
```

### files

```kotlin
// List files
val result = client.files.listFiles()
println(result)
```

### Files

```kotlin
// List files
val result = client.files2.listFiles()
println(result)
```

### Embeddings

```kotlin
// Create embeddings
val result = client.embeddings.createEmbedding()
println(result)
```

### embeddings

```kotlin
// Create embeddings
val result = client.embeddings2.createEmbedding()
println(result)
```

### context

```kotlin
// Chat with context
val result = client.context.chatWith()
println(result)
```

### Context

```kotlin
// Chat with context
val result = client.context2.chatWith()
println(result)
```

### batches

```kotlin
// Cancel batch
val result = client.batches.cancelBatch()
println(result)
```

### Batches

```kotlin
// Cancel batch
val result = client.batches2.cancelBatch()
println(result)
```

### audio

```kotlin
// Create translation
val result = client.audio.createTranslation()
println(result)
```

### Audio

```kotlin
// Create translation
val result = client.audio2.createTranslation()
println(result)
```

### Assistants

```kotlin
// Get assistant
val result = client.assistants.getAssistant()
println(result)
```

### assistants

```kotlin
// Get assistant
val result = client.assistants2.getAssistant()
println(result)
```

### models

```kotlin
// Retrieve model
val result = client.models.retrieveModel()
println(result)
```

### Models

```kotlin
// Retrieve model
val result = client.models2.retrieveModel()
println(result)
```

## Error Handling

```kotlin
try {
    val result = client.i18nResource.options()
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
