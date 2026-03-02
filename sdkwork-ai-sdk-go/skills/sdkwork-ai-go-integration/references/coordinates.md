# SDK Coordinates

- Domain: ai
- Language: go
- SDK package directory: `sdkwork-ai-sdk-go`
- Build descriptor: `go.mod`
- SDK coordinate: `github.com/sdkwork/ai-sdk@v1.0.0`

## Integration Commands

- Registry mode: `go get github.com/sdkwork/ai-sdk@v1.0.0`
- Local mode: `go mod edit -replace github.com/sdkwork/ai-sdk=<path-to-sdkwork-ai-sdk-go> && go mod tidy`

## Validation Commands

- Stage 1: `go mod tidy`
- Stage 5: `go test ./...`

