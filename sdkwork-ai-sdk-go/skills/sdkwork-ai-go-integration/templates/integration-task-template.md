# SDK Integration Task Template

## Context

- Domain: ai
- Language: go
- SDK package: `sdkwork-ai-sdk-go`
- Target app path: <fill>
- Integration mode: <registry | local-path>

## Stage Plan

1. Stage 0 Discover
2. Stage 1 Wire Dependency
3. Stage 2 Configure Client
4. Stage 3 Minimal Viable Call
5. Stage 4 Advanced Capability (optional)
6. Stage 5 Verify and Handoff

## Commands

- Registry integration: `go get github.com/sdkwork/ai-sdk@v1.0.0`
- Local integration: `go mod edit -replace github.com/sdkwork/ai-sdk=<path-to-sdkwork-ai-sdk-go> && go mod tidy`
- Stage 1 verification: `go mod tidy`
- Stage 5 verification: `go test ./...`

## Deliverables

- [ ] Dependency integrated
- [ ] Client configured
- [ ] Minimal API call path verified
- [ ] Advanced capabilities verified (if enabled)
- [ ] Handoff + rollback documented

