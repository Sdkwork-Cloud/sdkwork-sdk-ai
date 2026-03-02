# Progressive Loading Reference

## Profile

- Domain: ai
- Language: csharp
- SDK package: sdkwork-ai-sdk-csharp
- Build descriptor: `Ai.csproj`

## Stage Gates

### Stage 0 Discover
- [ ] Build descriptor found
- [ ] Dependency mode selected
- [ ] Config key source confirmed

### Stage 1 Wire Dependency
- Registry command: `dotnet add package Ai --version 1.0.0`
- Local command: `dotnet add <target.csproj> reference <path-to-sdkwork-ai-sdk-csharp/Ai.csproj>`
- Verification: `dotnet restore`
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
- Verification: `dotnet test`
- [ ] Verification passed
- [ ] Handoff completed
- [ ] Rollback path documented

