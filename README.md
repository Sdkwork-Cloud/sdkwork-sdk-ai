# SDKWork AI SDK

This directory contains all generated SDK artifacts for the `ai` API group.

## OpenAPI Source

- Local snapshot: `ai-openapi-8080.json`
- Runtime endpoint: `http://localhost:8080/v3/api-docs/ai`

Before regeneration, make sure the endpoint returns a valid OpenAPI 3.x document.

## Generated Languages

- `sdkwork-ai-sdk-typescript`
- `sdkwork-ai-sdk-python`
- `sdkwork-ai-sdk-go`
- `sdkwork-ai-sdk-java`
- `sdkwork-ai-sdk-kotlin`
- `sdkwork-ai-sdk-swift`
- `sdkwork-ai-sdk-csharp`
- `sdkwork-ai-sdk-flutter`

## sdk-common Dependency Strategy

To avoid local-path dependency constraints, generated SDKs use package registry or git repository coordinates for shared `sdk-common`:

- TypeScript: default npm dependency `@sdkwork/sdk-common`, with optional git source switch via `sdkwork-ai-sdk-typescript/package.json` scripts.
- Go: git module dependency `github.com/sdkwork/sdk-common-go`.
- Swift: git package dependency `https://github.com/sdkwork/sdk-common-swift.git`.
- Java, Kotlin, Python, C#, Flutter: registry-based dependency coordinates (no local `file:` dependency).

## Regenerate SDKs

Run from repository root:

```bash
./spring-ai-plus-ai-api/sdkwork-sdk-ai/bin/generate-sdk.sh
```

Deployed environment via base URL:

```bash
BASE_URL=https://api.example.com ./spring-ai-plus-ai-api/sdkwork-sdk-ai/bin/generate-sdk.sh
```

Custom local host and port:

```bash
HOST=localhost PORT=18080 ./spring-ai-plus-ai-api/sdkwork-sdk-ai/bin/generate-sdk.sh
```

Generate only selected languages:

```bash
LANGUAGES=typescript,python ./spring-ai-plus-ai-api/sdkwork-sdk-ai/bin/generate-sdk.sh
```

Shell flags are also supported:

```bash
./spring-ai-plus-ai-api/sdkwork-sdk-ai/bin/generate-sdk.sh --base-url https://api.example.com --languages typescript,python
```

PowerShell:

```powershell
.\spring-ai-plus-ai-api\sdkwork-sdk-ai\bin\generate-sdk.ps1 -Languages typescript,python
```

PowerShell with deployed base URL:

```powershell
.\spring-ai-plus-ai-api\sdkwork-sdk-ai\bin\generate-sdk.ps1 -BaseUrl https://api.example.com -Languages typescript,python
```

PowerShell with custom domain and port:

```powershell
.\spring-ai-plus-ai-api\sdkwork-sdk-ai\bin\generate-sdk.ps1 -Domain localhost -Port 18080 -Languages typescript
```

Manual single-language generation is still supported:

```bash
node sdk/sdkwork-sdk-generator/bin/sdkgen.js generate \
  -i spring-ai-plus-ai-api/sdkwork-sdk-ai/ai-openapi-8080.json \
  -o spring-ai-plus-ai-api/sdkwork-sdk-ai/sdkwork-ai-sdk-<language> \
  -n sdkwork-ai-sdk \
  -t ai \
  -l <language> \
  --base-url http://localhost:8080 \
  --api-prefix /ai/v3
```

`<language>` supports:

- `typescript`
- `python`
- `go`
- `java`
- `kotlin`
- `swift`
- `csharp`
- `flutter`

## Refresh OpenAPI Snapshot

If you want to regenerate from the latest running service schema:

```bash
curl http://localhost:8080/v3/api-docs/ai -o spring-ai-plus-ai-api/sdkwork-sdk-ai/ai-openapi-8080.json
```

The wrapper scripts derive the schema endpoint from the same runtime base URL. `BASE_URL` or `-BaseUrl` has the highest priority; otherwise the scripts fall back to `http://localhost:8080`.

## Authentication Modes (Mutually Exclusive)

Use exactly one auth mode for the same client instance.

1. API Key mode
- Header: `Authorization: Bearer <apiKey>`

2. Dual-token mode
- Header: `Access-Token: <accessToken>`
- Header: `Authorization: Bearer <authToken>`

Do not configure API key together with dual tokens on the same client instance.

## Publish Standard (Per Language `bin`)

Every language SDK directory now includes:

- `bin/publish-core.mjs` (shared cross-platform publish core)
- `bin/publish.sh` (Linux/macOS entrypoint)
- `bin/publish.ps1` (Windows/PowerShell entrypoint)

Example:

```bash
cd spring-ai-plus-ai-api/sdkwork-sdk-ai/sdkwork-ai-sdk-typescript
./bin/publish.sh --action check
./bin/publish.sh --action publish --channel release
```

```powershell
cd spring-ai-plus-ai-api/sdkwork-sdk-ai/sdkwork-ai-sdk-java
.\bin\publish.ps1 --action publish --channel test --dry-run
```

Actions:

- `check`: validate package and publish prerequisites
- `build`: build package artifact only
- `publish`: publish to target registry (or tag-based release for Go/Swift)

Common target ecosystems:

- TypeScript -> npm (`npm publish`)
- Python -> PyPI/TestPyPI (`python -m twine upload`)
- Java/Kotlin -> Maven Central compatible flow (`mvn deploy` / `gradle publish`)
- C# -> NuGet (`dotnet nuget push`)
- Flutter -> pub.dev (`dart pub publish`)
- Go/Swift -> Git tag release flow (proxy/index consumption)

## Client Naming

The generated primary client name is unified across languages:

- `SdkworkAiClient`

Each language package includes its own usage examples in its local `README.md`.

## Language README Entrypoints

- `sdkwork-ai-sdk-typescript/README.md`
- `sdkwork-ai-sdk-python/README.md`
- `sdkwork-ai-sdk-go/README.md`
- `sdkwork-ai-sdk-java/README.md`
- `sdkwork-ai-sdk-kotlin/README.md`
- `sdkwork-ai-sdk-swift/README.md`
- `sdkwork-ai-sdk-csharp/README.md`
- `sdkwork-ai-sdk-flutter/README.md`

## Troubleshooting

- If input is not a valid OpenAPI 3.x document, generation fails fast by design.
- If the input payload is an upstream error envelope (`code/msg`) instead of schema, generation stops with source validation error.
- Verify your running endpoint first: `http://localhost:8080/v3/api-docs/ai`.
