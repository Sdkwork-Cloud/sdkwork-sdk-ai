# Progressive Loading Reference

## Profile

- Domain: ai
- Language: flutter
- SDK package: sdkwork-ai-sdk-flutter
- Build descriptor: `pubspec.yaml`

## Stage Gates

### Stage 0 Discover
- [ ] Build descriptor found
- [ ] Dependency mode selected
- [ ] Config key source confirmed

### Stage 1 Wire Dependency
- Registry command: `flutter pub add ai_sdk`
- Local command: `flutter pub add ai_sdk --path <path-to-sdkwork-ai-sdk-flutter>`
- Verification: `flutter pub get`
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
- Verification: `flutter test`
- [ ] Verification passed
- [ ] Handoff completed
- [ ] Rollback path documented

