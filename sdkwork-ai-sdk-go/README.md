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
    result, err := client.Open.Options()
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

```go
// GET /v1/open/i18n/options
result, err := client.Open.Options()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### chat

```go
// Get chat completion
result, err := client.Chat.GetCompletion()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### video

```go
// List videos
result, err := client.Video.ListVideos()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### thread

```go
// Submit tool outputs
result, err := client.Thread.SubmitToolOutputs()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### response

```go
// Cancel response
result, err := client.Response.Cancel()
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

### moderation

```go
// Create moderation
result, err := client.Moderation.CreateModeration()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### message

```go
// Count Claude tokens
result, err := client.Message.CountClaudeTokens()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### knowledge_base

```go
// List documents
result, err := client.KnowledgeBase.ListDocuments()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### image

```go
// Create image variation
result, err := client.Image.CreateImageVariation()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### file

```go
// List files
result, err := client.File.ListFiles()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### embedding

```go
// Create embeddings
result, err := client.Embedding.CreateEmbedding()
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

### batch

```go
// Cancel batch
result, err := client.Batch.Cancel()
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

### assistant

```go
// Get assistant
result, err := client.Assistant.GetAssistant()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

### model

```go
// Retrieve model
result, err := client.Model.Retrieve()
if err != nil {
    panic(err)
}
fmt.Println(result)
```

## Error Handling

```go
result, err := client.Open.Options()
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
