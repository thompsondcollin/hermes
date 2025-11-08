FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY target/hermes-*.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","app.jar"]
