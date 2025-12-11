FROM maven:3.9.11-eclipse-temurin-11-alpine
RUN apk add curl
RUN apk add jq
COPY src /home/seleniumbddtestframework/src
COPY pom.xml /home/seleniumbddtestframework
COPY testng.xml /home/seleniumbddtestframework
COPY runner.sh runner.sh
RUN dos2unix runner.sh
RUN mvn -f /home/seleniumbddtestframework/pom.xml test -DskipTests=true
ENTRYPOINT sh runner.sh