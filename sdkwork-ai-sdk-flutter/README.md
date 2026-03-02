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
final result = await client.chat.listCompletions();
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

```dart
// Get chat completion
final result = await client.chat.getCompletion();
print(result);
```

### videos

```dart
// List videos
final result = await client.videos.listVideos();
print(result);
```

### threads

```dart
// Submit tool outputs
final result = await client.threads.submitToolOutputs();
print(result);
```

### responses

```dart
// Cancel response
final result = await client.responses.cancelResponse();
print(result);
```

### rerank

```dart
// Rerank documents
final result = await client.rerank.rerank();
print(result);
```

### music

```dart
// Generate music
final result = await client.music.generate();
print(result);
```

### moderations

```dart
// Create moderation
final result = await client.moderations.createModeration();
print(result);
```

### chat_completions

```dart
// Get chat completion
final result = await client.chatCompletions.getChatCompletion();
print(result);
```

### knowledge_bases

```dart
// List documents
final result = await client.knowledgeBases.listDocuments();
print(result);
```

### images

```dart
// Create image variation
final result = await client.images.createImageVariation();
print(result);
```

### files

```dart
// List files
final result = await client.files.listFiles();
print(result);
```

### embeddings

```dart
// Create embeddings
final result = await client.embeddings.createEmbedding();
print(result);
```

### context

```dart
// Chat with context
final result = await client.context.chatWith();
print(result);
```

### batches

```dart
// Cancel batch
final result = await client.batches.cancelBatch();
print(result);
```

### audio

```dart
// Create translation
final result = await client.audio.createTranslation();
print(result);
```

### assistants

```dart
// Get assistant
final result = await client.assistants.getAssistant();
print(result);
```

### models

```dart
// Retrieve model
final result = await client.models.retrieveModel();
print(result);
```

## Error Handling

```dart
try {
  final result = await client.chat.listCompletions();
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
