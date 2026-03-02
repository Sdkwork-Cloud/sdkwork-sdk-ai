# Progressive Loading Reference

## Profile

- Domain: ai
- Language: kotlin
- SDK package: sdkwork-ai-sdk-kotlin
- Build descriptor: `build.gradle.kts`

## Stage Gates

### Stage 0 Discover
- [ ] Build descriptor found
- [ ] Dependency mode selected
- [ ] Config key source confirmed

### Stage 1 Wire Dependency
- Registry command: `implementation("com.sdkwork:ai-sdk:1.0.0")`
- Local command: `implementation(files("<path-to-sdkwork-ai-sdk-kotlin/build/libs/*.jar"))`
- Verification: `gradle build -x test`
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
- Verification: `gradle test`
- [ ] Verification passed
- [ ] Handoff completed
- [ ] Rollback path documented

