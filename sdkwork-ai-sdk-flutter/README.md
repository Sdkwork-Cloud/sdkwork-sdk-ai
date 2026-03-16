# sdkwork-ai-sdk (Flutter)

Professional Flutter SDK for SDKWork API.

## Installation

Add to `pubspec.yaml`:

```yaml
dependencies:
  ai_sdk: ^1.0.8
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
final result = await client.open.options();
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

```dart
// GET /v1/open/i18n/options
final result = await client.open.options();
print(result);
```

### chat

```dart
// Get chat completion
final result = await client.chat.getCompletion();
print(result);
```

### video

```dart
// List videos
final result = await client.video.listVideos();
print(result);
```

### thread

```dart
// Submit tool outputs
final result = await client.thread.submitToolOutputs();
print(result);
```

### response

```dart
// Cancel response
final result = await client.response.cancel();
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

### moderation

```dart
// Create moderation
final result = await client.moderation.createModeration();
print(result);
```

### message

```dart
// Count Claude tokens
final result = await client.message.countClaudeTokens();
print(result);
```

### knowledge_base

```dart
// List documents
final result = await client.knowledgeBase.listDocuments();
print(result);
```

### image

```dart
// Create image variation
final result = await client.image.createImageVariation();
print(result);
```

### file

```dart
// List files
final result = await client.file.listFiles();
print(result);
```

### embedding

```dart
// Create embeddings
final result = await client.embedding.createEmbedding();
print(result);
```

### context

```dart
// Chat with context
final result = await client.context.chatWith();
print(result);
```

### batch

```dart
// Cancel batch
final result = await client.batch.cancel();
print(result);
```

### audio

```dart
// Create translation
final result = await client.audio.createTranslation();
print(result);
```

### assistant

```dart
// Get assistant
final result = await client.assistant.getAssistant();
print(result);
```

### model

```dart
// Retrieve model
final result = await client.model.retrieve();
print(result);
```

## Error Handling

```dart
try {
  final result = await client.open.options();
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
