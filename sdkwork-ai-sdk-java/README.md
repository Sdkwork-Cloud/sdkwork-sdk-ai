# sdkwork-ai-sdk (Java)

Professional Java SDK for SDKWork API.

## Installation

Add to your `pom.xml`:

```xml
<dependency>
    <groupId>com.sdkwork</groupId>
    <artifactId>ai-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

Or with Gradle:

```groovy
implementation 'com.sdkwork:ai-sdk:1.0.0'
```

## Quick Start

```java
import com.sdkwork.ai.SdkworkAiClient;
import com.sdkwork.common.core.Types;

public class Main {
    public static void main(String[] args) throws Exception {
        Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
        SdkworkAiClient client = new SdkworkAiClient(config);
        client.setApiKey("your-api-key");
        
        // Use the SDK
        Object result = client.getI18nResource().options();
        System.out.println(result);
    }
}
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```java
Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
SdkworkAiClient client = new SdkworkAiClient(config);
client.setApiKey("your-api-key");
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```java
Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
SdkworkAiClient client = new SdkworkAiClient(config);
client.setAuthToken("your-auth-token");
client.setAccessToken("your-access-token");
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```java
Types.SdkConfig config = new Types.SdkConfig("http://localhost:8080");
SdkworkAiClient client = new SdkworkAiClient(config);

// Set custom headers
client.getHttpClient().setHeader("X-Custom-Header", "value");
```

## API Modules

- `client.getI18nResource()` - i-18n-resource-controller API
- `client.getChat()` - Chat API
- `client.getChat2()` - chat API
- `client.getVideos()` - videos API
- `client.getVideos2()` - Videos API
- `client.getThreads()` - Threads API
- `client.getThreads2()` - threads API
- `client.getResponses()` - responses API
- `client.getResponses2()` - Responses API
- `client.getRerank()` - rerank API
- `client.getRerank2()` - Rerank API
- `client.getMusic()` - Music API
- `client.getMusic2()` - music API
- `client.getModerations()` - Moderations API
- `client.getModerations2()` - moderations API
- `client.getChatCompletions()` - chat_completions API
- `client.getChatCompletions2()` - Chat Completions Management API
- `client.getKnowledgeBases()` - Knowledge Bases API
- `client.getKnowledgeBases2()` - knowledge_bases API
- `client.getImages()` - images API
- `client.getImages2()` - Images API
- `client.getFiles()` - files API
- `client.getFiles2()` - Files API
- `client.getEmbeddings()` - Embeddings API
- `client.getEmbeddings2()` - embeddings API
- `client.getContext()` - context API
- `client.getContext2()` - Context API
- `client.getBatches()` - batches API
- `client.getBatches2()` - Batches API
- `client.getAudio()` - audio API
- `client.getAudio2()` - Audio API
- `client.getAssistants()` - Assistants API
- `client.getAssistants2()` - assistants API
- `client.getModels()` - models API
- `client.getModels2()` - Models API

## Usage Examples

### i-18n-resource-controller

```java
// GET /v1/open/i18n/options
Object result = client.getI18nResource().options();
System.out.println(result);
```

### Chat

```java
// Get chat completion
Object result = client.getChat().getCompletion();
System.out.println(result);
```

### chat

```java
// Get chat completion
Object result = client.getChat2().getCompletion();
System.out.println(result);
```

### videos

```java
// List videos
Object result = client.getVideos().listVideos();
System.out.println(result);
```

### Videos

```java
// List videos
Object result = client.getVideos2().listVideos();
System.out.println(result);
```

### Threads

```java
// Submit tool outputs
Object result = client.getThreads().submitToolOutputs();
System.out.println(result);
```

### threads

```java
// Submit tool outputs
Object result = client.getThreads2().submitToolOutputs();
System.out.println(result);
```

### responses

```java
// Cancel response
Object result = client.getResponses().cancelResponse();
System.out.println(result);
```

### Responses

```java
// Cancel response
Object result = client.getResponses2().cancelResponse();
System.out.println(result);
```

### rerank

```java
// Rerank documents
Object result = client.getRerank().rerank();
System.out.println(result);
```

### Rerank

```java
// Rerank documents
Object result = client.getRerank2().rerank();
System.out.println(result);
```

### Music

```java
// Generate music
Object result = client.getMusic().generate();
System.out.println(result);
```

### music

```java
// Generate music
Object result = client.getMusic2().generate();
System.out.println(result);
```

### Moderations

```java
// Create moderation
Object result = client.getModerations().createModeration();
System.out.println(result);
```

### moderations

```java
// Create moderation
Object result = client.getModerations2().createModeration();
System.out.println(result);
```

### chat_completions

```java
// Get chat completion
Object result = client.getChatCompletions().getChatCompletion();
System.out.println(result);
```

### Chat Completions Management

```java
// Get chat completion
Object result = client.getChatCompletions2().getChatCompletion();
System.out.println(result);
```

### Knowledge Bases

```java
// List documents
Object result = client.getKnowledgeBases().listDocuments();
System.out.println(result);
```

### knowledge_bases

```java
// List documents
Object result = client.getKnowledgeBases2().listDocuments();
System.out.println(result);
```

### images

```java
// Create image variation
Object result = client.getImages().createImageVariation();
System.out.println(result);
```

### Images

```java
// Create image variation
Object result = client.getImages2().createImageVariation();
System.out.println(result);
```

### files

```java
// List files
Object result = client.getFiles().listFiles();
System.out.println(result);
```

### Files

```java
// List files
Object result = client.getFiles2().listFiles();
System.out.println(result);
```

### Embeddings

```java
// Create embeddings
Object result = client.getEmbeddings().createEmbedding();
System.out.println(result);
```

### embeddings

```java
// Create embeddings
Object result = client.getEmbeddings2().createEmbedding();
System.out.println(result);
```

### context

```java
// Chat with context
Object result = client.getContext().chatWith();
System.out.println(result);
```

### Context

```java
// Chat with context
Object result = client.getContext2().chatWith();
System.out.println(result);
```

### batches

```java
// Cancel batch
Object result = client.getBatches().cancelBatch();
System.out.println(result);
```

### Batches

```java
// Cancel batch
Object result = client.getBatches2().cancelBatch();
System.out.println(result);
```

### audio

```java
// Create translation
Object result = client.getAudio().createTranslation();
System.out.println(result);
```

### Audio

```java
// Create translation
Object result = client.getAudio2().createTranslation();
System.out.println(result);
```

### Assistants

```java
// Get assistant
Object result = client.getAssistants().getAssistant();
System.out.println(result);
```

### assistants

```java
// Get assistant
Object result = client.getAssistants2().getAssistant();
System.out.println(result);
```

### models

```java
// Retrieve model
Object result = client.getModels().retrieveModel();
System.out.println(result);
```

### Models

```java
// Retrieve model
Object result = client.getModels2().retrieveModel();
System.out.println(result);
```

## Error Handling

```java
try {
    Object result = client.getI18nResource().options();
} catch (Exception e) {
    System.err.println("Error: " + e.getMessage());
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

> Use Maven `settings.xml` credentials and optional `MAVEN_PUBLISH_PROFILE`.

## License

MIT
