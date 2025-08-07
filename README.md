Purpose of this project

1. For learn Java.
1. For studying [Fullstack roadmap](https://github.com/jihyeonjeong11/FullStack-Roadmap) step by step.
1. For understanding of legacy backend codebase, written in Java.

## 1. Spring Boot Framework understandings

[Roadmap](https://roadmap.sh/spring-boot)

### 1. Architecture: gradle(maven)

- gradlew: runtime
- build.gradle(pom.xml): package.json
- src/main/java/com/path/projectName: Where actual java codes lie.

### gradlew commands

- ./gradlew bootRun: This fires tomcat web server to boot localhost
- ./gradlew test:

### Glossary

- All terms I wrote comparing with django python... cs I know django.

- bean: requirements.txt but spring handles its lifecycle as Bean object. [reference](https://www.baeldung.com/spring-bean)
- actuators: server utilities for management like django-health-check [reference](https://www.baeldung.com/spring-boot-actuators)
- annotations: directives & decorators [references](https://docs.spring.io/spring-framework/reference/testing/annotations.html)
