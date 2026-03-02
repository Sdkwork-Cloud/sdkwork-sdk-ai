# SDK Integration Task Template

## Context

- Domain: ai
- Language: flutter
- SDK package: `sdkwork-ai-sdk-flutter`
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

- Registry integration: `flutter pub add ai_sdk`
- Local integration: `flutter pub add ai_sdk --path <path-to-sdkwork-ai-sdk-flutter>`
- Stage 1 verification: `flutter pub get`
- Stage 5 verification: `flutter test`

## Deliverables

- [ ] Dependency integrated
- [ ] Client configured
- [ ] Minimal API call path verified
- [ ] Advanced capabilities verified (if enabled)
- [ ] Handoff + rollback documented

