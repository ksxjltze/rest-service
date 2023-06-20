FROM eclipse-temurin:17-jdk-alpine
ARG DB_USER
ARG DB_PASSWORD
ARG DB_DATABASE
COPY . .
RUN ./gradlew build
ENTRYPOINT ["java","-jar","build/libs/rest-service-0.0.1-SNAPSHOT.jar"]