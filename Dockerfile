FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} simple-yatra-svc.jar
EXPOSE 9091
CMD ["java", "-jar", "/simple-yatra-svc.jar"]