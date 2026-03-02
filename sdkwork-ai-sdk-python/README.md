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
result = client.chat.list_completions()
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

- `client.chat` - chat API
- `client.videos` - videos API
- `client.threads` - threads API
- `client.responses` - responses API
- `client.rerank` - rerank API
- `client.music` - music API
- `client.moderations` - moderations API
- `client.chat_completions` - chat_completions API
- `client.knowledge_bases` - knowledge_bases API
- `client.images` - images API
- `client.files` - files API
- `client.embeddings` - embeddings API
- `client.context` - context API
- `client.batches` - batches API
- `client.audio` - audio API
- `client.assistants` - assistants API
- `client.models` - models API


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
