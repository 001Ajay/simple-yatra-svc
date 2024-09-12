FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} simple-yatra-svc-0.0.1-SNAPSHOT.jar
EXPOSE 9091
CMD ["java", "-jar", "/simple-yatra-svc-0.0.1-SNAPSHOT.jar"]