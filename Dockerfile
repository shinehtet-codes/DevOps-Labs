FROM eclipse-temurin:25-jdk
COPY ./target/semApp-v0.1.0.2.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "semApp-v0.1.0.2.jar"]