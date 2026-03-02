# Progressive Loading Reference

## Profile

- Domain: ai
- Language: swift
- SDK package: sdkwork-ai-sdk-swift
- Build descriptor: `Package.swift`

## Stage Gates

### Stage 0 Discover
- [ ] Build descriptor found
- [ ] Dependency mode selected
- [ ] Config key source confirmed

### Stage 1 Wire Dependency
- Registry command: `.package(url: "https://github.com/sdkwork/ai-sdk-swift", from: "1.0.0")`
- Local command: `.package(path: "<path-to-sdkwork-ai-sdk-swift>")`
- Verification: `swift build`
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
- Verification: `swift test`
- [ ] Verification passed
- [ ] Handoff completed
- [ ] Rollback path documented

