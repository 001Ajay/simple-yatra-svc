FROM openjdk:17-jdk-alpine
COPY target/simple-yatra-svc-0.0.1-SNAPSHOT.jar /simple-yatra-svc-0.0.1-SNAPSHOT.jar
EXPOSE 9091
CMD ["java", "-jar", "simple-yatra-svc-0.0.1-SNAPSHOT.jar"]