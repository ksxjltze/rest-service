@echo off
REM Read environment variables from .env file
FOR /F "tokens=*" %%G IN (.env) DO SET %%G
docker run -e DB_USER=%DB_USER% -e DB_PASS=%DB_PASS% ksxjltze/spring-booter