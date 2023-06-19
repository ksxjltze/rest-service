mkdir "build/extracted/"
java -Djarmode=layertools -jar "build/libs/rest-service-0.0.1-SNAPSHOT.jar" extract --destination build/extracted
docker build -t ksxjltze/spring-booter .