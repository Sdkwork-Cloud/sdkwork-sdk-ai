# sdkwork-ai-sdk (C#)

Professional C# SDK for SDKWork API.

## Installation

```bash
dotnet add package Ai
```

Or add to your `.csproj`:

```xml
<PackageReference Include="Ai" Version="1.0.0" />
```

## Quick Start

```csharp
using Ai;
using SDKwork.Common.Core;

var config = new SdkConfig("http://localhost:8080");
var client = new SdkworkAiClient(config);
client.SetApiKey("your-api-key");

// Use the SDK
var result = await client.Chat.ListCompletionsAsync();
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

- `client.Chat` - chat API
- `client.Videos` - videos API
- `client.Threads` - threads API
- `client.Responses` - responses API
- `client.Rerank` - rerank API
- `client.Music` - music API
- `client.Moderations` - moderations API
- `client.ChatCompletions` - chat_completions API
- `client.KnowledgeBases` - knowledge_bases API
- `client.Images` - images API
- `client.Files` - files API
- `client.Embeddings` - embeddings API
- `client.Context` - context API
- `client.Batches` - batches API
- `client.Audio` - audio API
- `client.Assistants` - assistants API
- `client.Models` - models API

## Usage Examples

### chat

```csharp
// Get chat completion
var result = await client.Chat.GetCompletionAsync();
Console.WriteLine(result);
```

### videos

```csharp
// List videos
var result = await client.Videos.ListVideosAsync();
Console.WriteLine(result);
```

### threads

```csharp
// Submit tool outputs
var result = await client.Threads.SubmitToolOutputsAsync();
Console.WriteLine(result);
```

### responses

```csharp
// Cancel response
var result = await client.Responses.CancelResponseAsync();
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

### moderations

```csharp
// Create moderation
var result = await client.Moderations.CreateModerationAsync();
Console.WriteLine(result);
```

### chat_completions

```csharp
// Get chat completion
var result = await client.ChatCompletions.GetChatCompletionAsync();
Console.WriteLine(result);
```

### knowledge_bases

```csharp
// List documents
var result = await client.KnowledgeBases.ListDocumentsAsync();
Console.WriteLine(result);
```

### images

```csharp
// Create image variation
var result = await client.Images.CreateImageVariationAsync();
Console.WriteLine(result);
```

### files

```csharp
// List files
var result = await client.Files.ListFilesAsync();
Console.WriteLine(result);
```

### embeddings

```csharp
// Create embeddings
var result = await client.Embeddings.CreateEmbeddingAsync();
Console.WriteLine(result);
```

### context

```csharp
// Chat with context
var result = await client.Context.ChatWithAsync();
Console.WriteLine(result);
```

### batches

```csharp
// Cancel batch
var result = await client.Batches.CancelBatchAsync();
Console.WriteLine(result);
```

### audio

```csharp
// Create translation
var result = await client.Audio.CreateTranslationAsync();
Console.WriteLine(result);
```

### assistants

```csharp
// Get assistant
var result = await client.Assistants.GetAssistantAsync();
Console.WriteLine(result);
```

### models

```csharp
// Retrieve model
var result = await client.Models.RetrieveModelAsync();
Console.WriteLine(result);
```

## Error Handling

```csharp
try
{
    var result = await client.Chat.ListCompletionsAsync();
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
