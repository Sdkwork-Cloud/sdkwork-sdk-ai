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
        Object result = client.getChat().listCompletions();
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

- `client.getChat()` - chat API
- `client.getVideos()` - videos API
- `client.getThreads()` - threads API
- `client.getResponses()` - responses API
- `client.getRerank()` - rerank API
- `client.getMusic()` - music API
- `client.getModerations()` - moderations API
- `client.getChatCompletions()` - chat_completions API
- `client.getKnowledgeBases()` - knowledge_bases API
- `client.getImages()` - images API
- `client.getFiles()` - files API
- `client.getEmbeddings()` - embeddings API
- `client.getContext()` - context API
- `client.getBatches()` - batches API
- `client.getAudio()` - audio API
- `client.getAssistants()` - assistants API
- `client.getModels()` - models API

## Usage Examples

### chat

```java
// Get chat completion
Object result = client.getChat().getCompletion();
System.out.println(result);
```

### videos

```java
// List videos
Object result = client.getVideos().listVideos();
System.out.println(result);
```

### threads

```java
// Submit tool outputs
Object result = client.getThreads().submitToolOutputs();
System.out.println(result);
```

### responses

```java
// Cancel response
Object result = client.getResponses().cancelResponse();
System.out.println(result);
```

### rerank

```java
// Rerank documents
Object result = client.getRerank().rerank();
System.out.println(result);
```

### music

```java
// Generate music
Object result = client.getMusic().generate();
System.out.println(result);
```

### moderations

```java
// Create moderation
Object result = client.getModerations().createModeration();
System.out.println(result);
```

### chat_completions

```java
// Get chat completion
Object result = client.getChatCompletions().getChatCompletion();
System.out.println(result);
```

### knowledge_bases

```java
// List documents
Object result = client.getKnowledgeBases().listDocuments();
System.out.println(result);
```

### images

```java
// Create image variation
Object result = client.getImages().createImageVariation();
System.out.println(result);
```

### files

```java
// List files
Object result = client.getFiles().listFiles();
System.out.println(result);
```

### embeddings

```java
// Create embeddings
Object result = client.getEmbeddings().createEmbedding();
System.out.println(result);
```

### context

```java
// Chat with context
Object result = client.getContext().chatWith();
System.out.println(result);
```

### batches

```java
// Cancel batch
Object result = client.getBatches().cancelBatch();
System.out.println(result);
```

### audio

```java
// Create translation
Object result = client.getAudio().createTranslation();
System.out.println(result);
```

### assistants

```java
// Get assistant
Object result = client.getAssistants().getAssistant();
System.out.println(result);
```

### models

```java
// Retrieve model
Object result = client.getModels().retrieveModel();
System.out.println(result);
```

## Error Handling

```java
try {
    Object result = client.getChat().listCompletions();
} catch (Exception e) {
    System.err.println("Error: " + e.getMessage());
}
```

## License

MIT
