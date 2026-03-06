# sdkwork-ai-sdk (Python)

Professional Python SDK for SDKWork API.

## Installation

```bash
pip install sdkwork-ai-sdk
```

## Quick Start

```python
from sdkwork_ai_sdk import SdkworkAiClient, SdkConfig

config = SdkConfig(
    base_url="http://localhost:8080",
)

client = SdkworkAiClient(config)
client.set_api_key("your-api-key")

# Use the SDK
result = client.i18n_resource.options()
```

## Authentication Modes (Mutually Exclusive)

Choose exactly one mode for the same client instance.

### Mode A: API Key

```python
config = SdkConfig(base_url="http://localhost:8080")
client = SdkworkAiClient(config)
client.set_api_key("your-api-key")
# Sends: Authorization: Bearer <apiKey>
```

### Mode B: Dual Token

```python
config = SdkConfig(base_url="http://localhost:8080")
client = SdkworkAiClient(config)
client.set_auth_token("your-auth-token")
client.set_access_token("your-access-token")
# Sends:
# Authorization: Bearer <authToken>
# Access-Token: <accessToken>
```

> Do not call `set_api_key(...)` together with `set_auth_token(...)` + `set_access_token(...)` on the same client.

## API Modules

- `client.i18n_resource` - i-18n-resource-controller API
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
- `client.chat_completions` - chat_completions API
- `client.chat_completions2` - Chat Completions Management API
- `client.knowledge_bases` - Knowledge Bases API
- `client.knowledge_bases2` - knowledge_bases API
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

> Set `PYPI_TOKEN` for release (or `TEST_PYPI_TOKEN` for test channel).

## License

MIT
