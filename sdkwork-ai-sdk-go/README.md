# sdkwork-ai-sdk (Go)

Professional Go SDK for SDKWork API.

## Installation

```bash
go get github.com/sdkwork/ai-sdk
```

## Quick Start

```go
package main

import (
    "fmt"
    "github.com/sdkwork/ai-sdk"
    sdkhttp "github.com/sdkwork/ai-sdk/http"
)

func main() {
    cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
    client := github.com/sdkwork/ai-sdk.NewSdkworkAiClientWithConfig(cfg)
    client.SetApiKey("your-api-key")
    
    // Use the SDK
    result, err := client.Chat.ListCompletions()
    if err != nil {
        panic(err)
    }
    fmt.Println(result)
}
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```go
cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
client := github.com/sdkwork/ai-sdk.NewSdkworkAiClientWithConfig(cfg)
client.SetApiKey("your-api-key")
// Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```go
cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
client := github.com/sdkwork/ai-sdk.NewSdkworkAiClientWithConfig(cfg)
client.SetAuthToken("your-auth-token")
client.SetAccessToken("your-access-token")
// Sends:
// Authorization: Bearer <authToken>
// Access-Token: <accessToken>
```

> Do not call `SetApiKey(...)` together with `SetAuthToken(...)` + `SetAccessToken(...)` on the same client.

## Configuration (Non-Auth)

```go
cfg := sdkhttp.NewDefaultConfig("http://localhost:8080")
client := github.com/sdkwork/ai-sdk.NewSdkworkAiClientWithConfig(cfg)

// Set custom headers
client.SetHeader("X-Custom-Header", "value")
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

```go
// Get chat completion
result, err := client.Chat.GetCompletion()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### videos

```go
// List videos
result, err := client.Videos.ListVideos()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### threads

```go
// Submit tool outputs
result, err := client.Threads.SubmitToolOutputs()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### responses

```go
// Cancel response
result, err := client.Responses.CancelResponse()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### rerank

```go
// Rerank documents
result, err := client.Rerank.Rerank()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### music

```go
// Generate music
result, err := client.Music.Generate()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### moderations

```go
// Create moderation
result, err := client.Moderations.CreateModeration()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### chat_completions

```go
// Get chat completion
result, err := client.ChatCompletions.GetChatCompletion()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### knowledge_bases

```go
// List documents
result, err := client.KnowledgeBases.ListDocuments()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### images

```go
// Create image variation
result, err := client.Images.CreateImageVariation()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### files

```go
// List files
result, err := client.Files.ListFiles()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### embeddings

```go
// Create embeddings
result, err := client.Embeddings.CreateEmbedding()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### context

```go
// Chat with context
result, err := client.Context.ChatWith()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### batches

```go
// Cancel batch
result, err := client.Batches.CancelBatch()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### audio

```go
// Create translation
result, err := client.Audio.CreateTranslation()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### assistants

```go
// Get assistant
result, err := client.Assistants.GetAssistant()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### models

```go
// Retrieve model
result, err := client.Models.RetrieveModel()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

## Error Handling

```go
result, err := client.Chat.ListCompletions()
if err != nil {
    // Handle error
    fmt.Println("Error:", err)
    return
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

> Set `GO_RELEASE_TAG` (or `SDKWORK_RELEASE_TAG`) and push tag if needed.

## License

MIT
