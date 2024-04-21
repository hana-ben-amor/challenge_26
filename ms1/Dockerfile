FROM eclipse-temurin:17-jdk-alpine

# Set environment variables


VOLUME /tmp
COPY target/ms1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]