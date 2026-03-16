# sdkwork-ai-sdk (C#)

Professional C# SDK for SDKWork API.

## Installation

```bash
dotnet add package Ai
```

Or add to your `.csproj`:

```xml
<PackageReference Include="Ai" Version="1.0.8" />
```

## Quick Start

```csharp
using Ai;
using SDKwork.Common.Core;

var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkAiClient(config);
client.SetApiKey("your-api-key");

// Use the SDK
var result = await client.Open.OptionsAsync();
Console.WriteLine(result);
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```csharp
var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkAiClient(config);
client.SetApiKey("your-api-key");
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```csharp
var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkAiClient(config);
client.SetAuthToken("your-auth-token");
client.SetAccessToken("your-access-token");
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `SetApiKey(...)` together with `SetAuthToken(...)` + `SetAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```csharp
var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkAiClient(config);

// Set custom headers
client.SetHeader("X-Custom-Header", "value");
```

## API Modules

- `client.Open` - open API
- `client.Chat` - chat API
- `client.Video` - video API
- `client.Thread` - thread API
- `client.Response` - response API
- `client.Rerank` - rerank API
- `client.Music` - music API
- `client.Moderation` - moderation API
- `client.Message` - message API
- `client.KnowledgeBase` - knowledge_base API
- `client.Image` - image API
- `client.File` - file API
- `client.Embedding` - embedding API
- `client.Context` - context API
- `client.Batch` - batch API
- `client.Audio` - audio API
- `client.Assistant` - assistant API
- `client.Model` - model API

## Usage Examples

### open

```csharp
// GET /v1/open/i18n/options
var result = await client.Open.OptionsAsync();
Console.WriteLine(result);
```

### chat

```csharp
// Get chat completion
var result = await client.Chat.GetCompletionAsync();
Console.WriteLine(result);
```

### video

```csharp
// List videos
var result = await client.Video.ListVideosAsync();
Console.WriteLine(result);
```

### thread

```csharp
// Submit tool outputs
var result = await client.Thread.SubmitToolOutputsAsync();
Console.WriteLine(result);
```

### response

```csharp
// Cancel response
var result = await client.Response.CancelAsync();
Console.WriteLine(result);
```

### rerank

```csharp
// Rerank documents
var result = await client.Rerank.RerankAsync();
Console.WriteLine(result);
```

### music

```csharp
// Generate music
var result = await client.Music.GenerateAsync();
Console.WriteLine(result);
```

### moderation

```csharp
// Create moderation
var result = await client.Moderation.CreateModerationAsync();
Console.WriteLine(result);
```

### message

```csharp
// Count Claude tokens
var result = await client.Message.CountClaudeTokensAsync();
Console.WriteLine(result);
```

### knowledge_base

```csharp
// List documents
var result = await client.KnowledgeBase.ListDocumentsAsync();
Console.WriteLine(result);
```

### image

```csharp
// Create image variation
var result = await client.Image.CreateImageVariationAsync();
Console.WriteLine(result);
```

### file

```csharp
// List files
var result = await client.File.ListFilesAsync();
Console.WriteLine(result);
```

### embedding

```csharp
// Create embeddings
var result = await client.Embedding.CreateEmbeddingAsync();
Console.WriteLine(result);
```

### context

```csharp
// Chat with context
var result = await client.Context.ChatWithAsync();
Console.WriteLine(result);
```

### batch

```csharp
// Cancel batch
var result = await client.Batch.CancelAsync();
Console.WriteLine(result);
```

### audio

```csharp
// Create translation
var result = await client.Audio.CreateTranslationAsync();
Console.WriteLine(result);
```

### assistant

```csharp
// Get assistant
var result = await client.Assistant.GetAssistantAsync();
Console.WriteLine(result);
```

### model

```csharp
// Retrieve model
var result = await client.Model.RetrieveAsync();
Console.WriteLine(result);
```

## Error Handling

```csharp
try
{
    var result = await client.Open.OptionsAsync();
}
catch (HttpRequestException ex)
{
    Console.WriteLine($"Error: {ex.Message}");
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

> Set `NUGET_API_KEY` for release (or `NUGET_TEST_API_KEY` for test channel).

## License

MIT
