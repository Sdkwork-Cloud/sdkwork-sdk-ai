---
name: sdkwork-ai-typescript-integration
description: Use when integrating the sdkwork-ai-sdk-typescript package into an application and you need staged progressive loading with explicit stage gates.
---

# Scope

Integrate `sdkwork-ai-sdk-typescript` into an application using progressive stages. Advance only when the current stage exits green.

# Inputs

- Target application path
- Runtime values (`baseUrl`, `apiKey`, timeout, retries)
- Integration mode (`registry` or `local-path`)
- Required capability level (`minimal` or `advanced`)

# SDK Coordinates

- Language: `typescript`
- Build descriptor: `package.json`
- SDK coordinate: `@sdkwork/ai-sdk@1.0.1`
- Registry integration: `pnpm add @sdkwork/ai-sdk`
- Local-path integration: `pnpm add file:<path-to-sdkwork-ai-sdk-typescript>`

Load `references/coordinates.md` before Stage 1.

# Progressive Workflow

## Stage 0: Discover

1. Read target app build descriptor and dependency strategy.
2. Read this SDK package README.
3. Locate target app config and secret-loading modules.

Exit gate:
- Dependency mode is chosen.
- Config key source for `baseUrl` and credentials is known.

## Stage 1: Wire Dependency

1. Apply dependency in target app according to selected mode.
2. Sync dependency metadata / lock files.
3. Run stage-1 verification.

Exit gate:
- Dependency resolves cleanly.
- Stage-1 verification command passes.

Verification command:
- `pnpm install`
- Script helper: `scripts/verify-stage.ps1 stage1 <workdir>` or `scripts/verify-stage.sh stage1 <workdir>`

## Stage 2: Configure Client

1. Build SDK client in composition root.
2. Bind `baseUrl`, credentials, timeout, retry strategy.
3. Ensure secrets come from env or secret manager only.

Exit gate:
- Client can initialize at runtime.
- No plaintext secret is committed.

## Stage 3: Minimal Viable Call

1. Implement one smallest business API path.
2. Cover success mapping and error mapping.
3. Produce stable output contract for upper layers.

Exit gate:
- End-to-end call succeeds in local or test env.
- Error path is observable and safely logged.

## Stage 4: Advanced Capability

Enable only when required:
- Streaming / long-running response
- Retry and backoff tuning
- Upload/download flows
- Interceptors / telemetry / middleware

Exit gate:
- Every enabled advanced feature has verification evidence.

## Stage 5: Verify and Handoff

1. Run stage-5 verification.
2. Record integration notes and constraints.
3. Output handoff summary (changes, verification, rollback).

Exit gate:
- Stage-5 verification passes.
- Handoff is complete and actionable.

Verification command:
- `pnpm run build`
- Script helper: `scripts/verify-stage.ps1 stage5 <workdir>` or `scripts/verify-stage.sh stage5 <workdir>`

# Dynamic Progression Rules

- Do not preload full repository context at Stage 0.
- Do not run Stage 4 before Stage 3 is green.
- If a stage fails, repair in-place and rerun that stage gate.
- Persist stage status using `templates/stage-state-template.yaml`.

# Output Contract

Produce final output with:
- Current stage and result
- Files changed
- Verification command and result
- Remaining risks and rollback instruction

# Assets

- `references/progressive-loading.md`
- `references/coordinates.md`
- `templates/integration-task-template.md`
- `templates/stage-state-template.yaml`
- `scripts/verify-stage.ps1`
- `scripts/verify-stage.sh`

