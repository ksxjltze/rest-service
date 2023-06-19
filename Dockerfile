FROM eclipse-temurin:17-jdk-alpine
COPY . .
RUN ./gradlew build --stacktrace --debug
ENTRYPOINT ["java","-jar","build/libs/rest-service-0.0.1-SNAPSHOT.jar"]