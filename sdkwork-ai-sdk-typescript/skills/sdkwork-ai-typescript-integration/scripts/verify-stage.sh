#!/usr/bin/env bash
set -euo pipefail

STAGE="${1:-stage5}"
WORKDIR="${2:-.}"

STAGE1_CMD='pnpm install'
STAGE5_CMD='pnpm run build'

if [[ ! -d "$WORKDIR" ]]; then
  echo "Workdir not found: $WORKDIR" >&2
  exit 2
fi

case "$STAGE" in
  stage1)
    CMD="$STAGE1_CMD"
    ;;
  stage5)
    CMD="$STAGE5_CMD"
    ;;
  *)
    echo "Unsupported stage: $STAGE" >&2
    exit 2
    ;;
esac

echo "[sdkwork] running $STAGE verification: $CMD"
cd "$WORKDIR"
eval "$CMD"
echo "[sdkwork] $STAGE verification passed."

