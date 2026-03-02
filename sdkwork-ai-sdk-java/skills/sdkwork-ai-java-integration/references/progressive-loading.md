# Progressive Loading Reference

## Profile

- Domain: ai
- Language: java
- SDK package: sdkwork-ai-sdk-java
- Build descriptor: `pom.xml`

## Stage Gates

### Stage 0 Discover
- [ ] Build descriptor found
- [ ] Dependency mode selected
- [ ] Config key source confirmed

### Stage 1 Wire Dependency
- Registry command: `mvn dependency:get -Dartifact=com.sdkwork:ai-sdk:1.0.0`
- Local command: `mvn install:install-file -Dfile=<path-to-jar> -DgroupId=com.sdkwork -DartifactId=ai-sdk -Dversion=1.0.0 -Dpackaging=jar`
- Verification: `mvn -DskipTests compile`
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
- Verification: `mvn test -DskipTests=false`
- [ ] Verification passed
- [ ] Handoff completed
- [ ] Rollback path documented

