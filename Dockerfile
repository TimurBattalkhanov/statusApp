FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/docker_app-1.0.jar /app
CMD ["java", "-jar", "docker_app-1.0.jar"]