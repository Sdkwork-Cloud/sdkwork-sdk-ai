# SDK Coordinates

- Domain: ai
- Language: java
- SDK package directory: `sdkwork-ai-sdk-java`
- Build descriptor: `pom.xml`
- SDK coordinate: `com.sdkwork:ai-sdk:1.0.0`

## Integration Commands

- Registry mode: `mvn dependency:get -Dartifact=com.sdkwork:ai-sdk:1.0.0`
- Local mode: `mvn install:install-file -Dfile=<path-to-jar> -DgroupId=com.sdkwork -DartifactId=ai-sdk -Dversion=1.0.0 -Dpackaging=jar`

## Validation Commands

- Stage 1: `mvn -DskipTests compile`
- Stage 5: `mvn test -DskipTests=false`

