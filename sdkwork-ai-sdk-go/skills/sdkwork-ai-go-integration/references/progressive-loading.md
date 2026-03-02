# Progressive Loading Reference

## Profile

- Domain: ai
- Language: go
- SDK package: sdkwork-ai-sdk-go
- Build descriptor: `go.mod`

## Stage Gates

### Stage 0 Discover
- [ ] Build descriptor found
- [ ] Dependency mode selected
- [ ] Config key source confirmed

### Stage 1 Wire Dependency
- Registry command: `go get github.com/sdkwork/ai-sdk@v1.0.0`
- Local command: `go mod edit -replace github.com/sdkwork/ai-sdk=<path-to-sdkwork-ai-sdk-go> && go mod tidy`
- Verification: `go mod tidy`
- [ ] Dependency resolved
- [ ] Metadata updated
- [ ] Verification passed

### Stage 2 Configure Client
- [ ] `baseUrl` mapped
- [ ] Credential source mapped
- [ ] Timeout and retry mapped

### Stage 3 Minimal Call
- [ ] One minimal API path integrated
- [ ] Success mapping verified
- [ ] Error mapping verified

### Stage 4 Advanced Capability
- [ ] Streaming (if needed)
- [ ] Retry/backoff tuning (if needed)
- [ ] Upload/download (if needed)
- [ ] Interceptors/telemetry (if needed)

### Stage 5 Verify and Handoff
- Verification: `go test ./...`
- [ ] Verification passed
- [ ] Handoff completed
- [ ] Rollback path documented

