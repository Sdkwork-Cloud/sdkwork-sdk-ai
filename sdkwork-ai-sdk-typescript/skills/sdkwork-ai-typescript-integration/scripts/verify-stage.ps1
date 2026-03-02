param(
    [ValidateSet("stage1", "stage5")]
    [string]$Stage = "stage5",
    [string]$Workdir = "."
)

$ErrorActionPreference = "Stop"

$stage1 = "pnpm install"
$stage5 = "pnpm run build"

if (-not (Test-Path $Workdir)) {
    throw "Workdir not found: $Workdir"
}

Push-Location $Workdir
try {
    $command = if ($Stage -eq "stage1") { $stage1 } else { $stage5 }
    Write-Host "[sdkwork] running $Stage verification: $command"
    Invoke-Expression $command
    if ($LASTEXITCODE -ne 0) {
        exit $LASTEXITCODE
    }
    Write-Host "[sdkwork] $Stage verification passed."
}
finally {
    Pop-Location
}

