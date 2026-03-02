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
    val result = client.chat.listCompletions()
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

```kotlin
// Get chat completion
val result = client.chat.getCompletion()
println(result)
```

### videos

```kotlin
// List videos
val result = client.videos.listVideos()
println(result)
```

### threads

```kotlin
// Submit tool outputs
val result = client.threads.submitToolOutputs()
println(result)
```

### responses

```kotlin
// Cancel response
val result = client.responses.cancelResponse()
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

### moderations

```kotlin
// Create moderation
val result = client.moderations.createModeration()
println(result)
```

### chat_completions

```kotlin
// Get chat completion
val result = client.chatCompletions.getChatCompletion()
println(result)
```

### knowledge_bases

```kotlin
// List documents
val result = client.knowledgeBases.listDocuments()
println(result)
```

### images

```kotlin
// Create image variation
val result = client.images.createImageVariation()
println(result)
```

### files

```kotlin
// List files
val result = client.files.listFiles()
println(result)
```

### embeddings

```kotlin
// Create embeddings
val result = client.embeddings.createEmbedding()
println(result)
```

### context

```kotlin
// Chat with context
val result = client.context.chatWith()
println(result)
```

### batches

```kotlin
// Cancel batch
val result = client.batches.cancelBatch()
println(result)
```

### audio

```kotlin
// Create translation
val result = client.audio.createTranslation()
println(result)
```

### assistants

```kotlin
// Get assistant
val result = client.assistants.getAssistant()
println(result)
```

### models

```kotlin
// Retrieve model
val result = client.models.retrieveModel()
println(result)
```

## Error Handling

```kotlin
try {
    val result = client.chat.listCompletions()
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
