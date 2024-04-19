FROM maven AS builder

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

FROM openjdk:21 AS runner

COPY --from=builder /app/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
