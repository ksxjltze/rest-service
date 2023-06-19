@echo off
REM Read environment variables from .env file
FOR /F "tokens=*" %%G IN (env.properties) DO SET %%G
docker run -p 8080:8080 -e DB_USER=%DB_USER% -e DB_PASSWORD=%DB_PASSWORD% -e DB_DATABASE=%DB_DATABASE% ksxjltze/spring-booter