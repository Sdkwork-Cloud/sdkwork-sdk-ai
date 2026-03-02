# SDK Integration Task Template

## Context

- Domain: ai
- Language: swift
- SDK package: `sdkwork-ai-sdk-swift`
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

- Registry integration: `.package(url: "https://github.com/sdkwork/ai-sdk-swift", from: "1.0.0")`
- Local integration: `.package(path: "<path-to-sdkwork-ai-sdk-swift>")`
- Stage 1 verification: `swift build`
- Stage 5 verification: `swift test`

## Deliverables

- [ ] Dependency integrated
- [ ] Client configured
- [ ] Minimal API call path verified
- [ ] Advanced capabilities verified (if enabled)
- [ ] Handoff + rollback documented

