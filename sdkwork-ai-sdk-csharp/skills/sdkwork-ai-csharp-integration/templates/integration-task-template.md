# SDK Integration Task Template

## Context

- Domain: ai
- Language: csharp
- SDK package: `sdkwork-ai-sdk-csharp`
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

- Registry integration: `dotnet add package Ai --version 1.0.0`
- Local integration: `dotnet add <target.csproj> reference <path-to-sdkwork-ai-sdk-csharp/Ai.csproj>`
- Stage 1 verification: `dotnet restore`
- Stage 5 verification: `dotnet test`

## Deliverables

- [ ] Dependency integrated
- [ ] Client configured
- [ ] Minimal API call path verified
- [ ] Advanced capabilities verified (if enabled)
- [ ] Handoff + rollback documented

