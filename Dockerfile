# ────────────────
# 1️⃣ BUILD STAGE
# ────────────────
FROM gradle:8.6-jdk21-alpine AS build

WORKDIR /app
COPY gradle gradle
COPY gradlew .
COPY build.gradle settings.gradle ./
COPY src src

RUN ./gradlew clean bootJar --no-daemon

# ────────────────
# 2️⃣ RUNTIME STAGE
# ────────────────
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
