# sdkwork-ai-sdk (Java)

Professional Java SDK for SDKWork API.

## Installation

Add to your `pom.xml`:

```xml
<dependency>
    <groupId>com.sdkwork</groupId>
    <artifactId>ai-sdk</artifactId>
    <version>1.0.8</version>
</dependency>
```

Or with Gradle:

```groovy
implementation 'com.sdkwork:ai-sdk:1.0.8'
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
        Object result = client.getOpen().options();
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

- `client.getOpen()` - open API
- `client.getChat()` - chat API
- `client.getVideo()` - video API
- `client.getThread()` - thread API
- `client.getResponse()` - response API
- `client.getRerank()` - rerank API
- `client.getMusic()` - music API
- `client.getModeration()` - moderation API
- `client.getMessage()` - message API
- `client.getKnowledgeBase()` - knowledge_base API
- `client.getImage()` - image API
- `client.getFile()` - file API
- `client.getEmbedding()` - embedding API
- `client.getContext()` - context API
- `client.getBatch()` - batch API
- `client.getAudio()` - audio API
- `client.getAssistant()` - assistant API
- `client.getModel()` - model API

## Usage Examples

### open

```java
// GET /v1/open/i18n/options
Object result = client.getOpen().options();
System.out.println(result);
```

### chat

```java
// Get chat completion
Object result = client.getChat().getCompletion();
System.out.println(result);
```

### video

```java
// List videos
Object result = client.getVideo().listVideos();
System.out.println(result);
```

### thread

```java
// Submit tool outputs
Object result = client.getThread().submitToolOutputs();
System.out.println(result);
```

### response

```java
// Cancel response
Object result = client.getResponse().cancel();
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

### moderation

```java
// Create moderation
Object result = client.getModeration().createModeration();
System.out.println(result);
```

### message

```java
// Count Claude tokens
Object result = client.getMessage().countClaudeTokens();
System.out.println(result);
```

### knowledge_base

```java
// List documents
Object result = client.getKnowledgeBase().listDocuments();
System.out.println(result);
```

### image

```java
// Create image variation
Object result = client.getImage().createImageVariation();
System.out.println(result);
```

### file

```java
// List files
Object result = client.getFile().listFiles();
System.out.println(result);
```

### embedding

```java
// Create embeddings
Object result = client.getEmbedding().createEmbedding();
System.out.println(result);
```

### context

```java
// Chat with context
Object result = client.getContext().chatWith();
System.out.println(result);
```

### batch

```java
// Cancel batch
Object result = client.getBatch().cancel();
System.out.println(result);
```

### audio

```java
// Create translation
Object result = client.getAudio().createTranslation();
System.out.println(result);
```

### assistant

```java
// Get assistant
Object result = client.getAssistant().getAssistant();
System.out.println(result);
```

### model

```java
// Retrieve model
Object result = client.getModel().retrieve();
System.out.println(result);
```

## Error Handling

```java
try {
    Object result = client.getOpen().options();
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
