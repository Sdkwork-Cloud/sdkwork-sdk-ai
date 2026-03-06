# sdkwork-ai-sdk (Flutter)

Professional Flutter SDK for SDKWork API.

## Installation

Add to `pubspec.yaml`:

```yaml
dependencies:
  ai_sdk: ^1.0.0
```

## Quick Start

```dart
import 'package:ai_sdk/ai_sdk.dart';
import 'package:sdkwork_common_flutter/sdkwork_common_flutter.dart';

final client = SdkworkAiClient(
  config: SdkConfig(
    baseUrl: 'http://localhost:8080',
  ),
);
client.setApiKey('your-api-key');

// Use the SDK
final result = await client.i18nResource.options();
print(result);
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```dart
final client = SdkworkAiClient.withBaseUrl(baseUrl: 'http://localhost:8080');
client.setApiKey('your-api-key');
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```dart
final client = SdkworkAiClient.withBaseUrl(baseUrl: 'http://localhost:8080');
client.setAuthToken('your-auth-token');
client.setAccessToken('your-access-token');
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `setApiKey(...)` together with `setAuthToken(...)` + `setAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```dart
final client = SdkworkAiClient.withBaseUrl(baseUrl: 'http://localhost:8080');

// Set custom headers
client.setHeader('X-Custom-Header', 'value');
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

```dart
// GET /v1/open/i18n/options
final result = await client.i18nResource.options();
print(result);
```

### Chat

```dart
// Get chat completion
final result = await client.chat.getCompletion();
print(result);
```

### chat

```dart
// Get chat completion
final result = await client.chat2.getCompletion();
print(result);
```

### videos

```dart
// List videos
final result = await client.videos.listVideos();
print(result);
```

### Videos

```dart
// List videos
final result = await client.videos2.listVideos();
print(result);
```

### Threads

```dart
// Submit tool outputs
final result = await client.threads.submitToolOutputs();
print(result);
```

### threads

```dart
// Submit tool outputs
final result = await client.threads2.submitToolOutputs();
print(result);
```

### responses

```dart
// Cancel response
final result = await client.responses.cancelResponse();
print(result);
```

### Responses

```dart
// Cancel response
final result = await client.responses2.cancelResponse();
print(result);
```

### rerank

```dart
// Rerank documents
final result = await client.rerank.rerank();
print(result);
```

### Rerank

```dart
// Rerank documents
final result = await client.rerank2.rerank();
print(result);
```

### Music

```dart
// Generate music
final result = await client.music.generate();
print(result);
```

### music

```dart
// Generate music
final result = await client.music2.generate();
print(result);
```

### Moderations

```dart
// Create moderation
final result = await client.moderations.createModeration();
print(result);
```

### moderations

```dart
// Create moderation
final result = await client.moderations2.createModeration();
print(result);
```

### chat_completions

```dart
// Get chat completion
final result = await client.chatCompletions.getChatCompletion();
print(result);
```

### Chat Completions Management

```dart
// Get chat completion
final result = await client.chatCompletions2.getChatCompletion();
print(result);
```

### Knowledge Bases

```dart
// List documents
final result = await client.knowledgeBases.listDocuments();
print(result);
```

### knowledge_bases

```dart
// List documents
final result = await client.knowledgeBases2.listDocuments();
print(result);
```

### images

```dart
// Create image variation
final result = await client.images.createImageVariation();
print(result);
```

### Images

```dart
// Create image variation
final result = await client.images2.createImageVariation();
print(result);
```

### files

```dart
// List files
final result = await client.files.listFiles();
print(result);
```

### Files

```dart
// List files
final result = await client.files2.listFiles();
print(result);
```

### Embeddings

```dart
// Create embeddings
final result = await client.embeddings.createEmbedding();
print(result);
```

### embeddings

```dart
// Create embeddings
final result = await client.embeddings2.createEmbedding();
print(result);
```

### context

```dart
// Chat with context
final result = await client.context.chatWith();
print(result);
```

### Context

```dart
// Chat with context
final result = await client.context2.chatWith();
print(result);
```

### batches

```dart
// Cancel batch
final result = await client.batches.cancelBatch();
print(result);
```

### Batches

```dart
// Cancel batch
final result = await client.batches2.cancelBatch();
print(result);
```

### audio

```dart
// Create translation
final result = await client.audio.createTranslation();
print(result);
```

### Audio

```dart
// Create translation
final result = await client.audio2.createTranslation();
print(result);
```

### Assistants

```dart
// Get assistant
final result = await client.assistants.getAssistant();
print(result);
```

### assistants

```dart
// Get assistant
final result = await client.assistants2.getAssistant();
print(result);
```

### models

```dart
// Retrieve model
final result = await client.models.retrieveModel();
print(result);
```

### Models

```dart
// Retrieve model
final result = await client.models2.retrieveModel();
print(result);
```

## Error Handling

```dart
try {
  final result = await client.i18nResource.options();
} catch (e) {
  print('Error: $e');
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

> Ensure `dart pub publish --dry-run` passes before release publish.

## License

MIT
