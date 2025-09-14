0914

next todo - add auth

Let's build multiplayer coding game.

1. determine frontend
2. determine database
3. determine backend - stick to spring with java. use Kotling with Ktor!
4. determine WSS

ex)nextjs for frontend & backend, spring for WSS, Postgres for database...

Purpose of this project

1. To learn Java.
2. To learn from roadmap.sh step by step.

Learning milestones

- To understand legacy backend(spring + mybatis), completing backend roadmap
- Expand things, getting newer.
- https://dev.to/ajayi/build-a-modern-web-app-with-spring-boot-react-a-full-stack-guide-36dk
- https://gitlab.com/cloud-devops-assignments/spring-boot-react-example // add frontend before go further!

[Fullstack roadmap](https://github.com/jihyeonjeong11/FullStack-Roadmap)
[Backend roadmap](https://roadmap.sh/backend) - current mysql.
[Spring Boot roadmap](https://roadmap.sh/spring-boot)

## 1. Spring Boot Framework understandings

[Roadmap](https://roadmap.sh/spring-boot)
[Spring tutorials](https://spring.io/guides/gs/spring-boot)

### 2. Architecture: gradle(maven)

- gradlew: runtime
- build.gradle(pom.xml): package.json
- src/main/java/com/path/projectName: Where actual java codes lie.

### 3. gradlew commands

- ./gradlew bootRun: This fires tomcat web server to boot localhost
- ./gradlew test:

### 4. Glossary

- All terms I wrote comparing with django python... cs I know django.

- bean: requirements.txt but spring handles its lifecycle as Bean object. [reference](https://www.baeldung.com/spring-bean)
- actuators: server utilities for management like django-health-check [reference](https://www.baeldung.com/spring-boot-actuators)
- annotations: directives & decorators [references](https://docs.spring.io/spring-framework/reference/testing/annotations.html)
