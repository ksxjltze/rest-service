FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY . .
RUN ./gradlew build
ENTRYPOINT ["java","-jar","build/libs/rest-service-0.0.1-SNAPSHOT.jar"]