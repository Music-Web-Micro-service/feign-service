FROM openjdk:17
WORKDIR /app

COPY ./target/feign-service-0.0.1-SNAPSHOT.jar ./target/feign-service-0.0.1-SNAPSHOT.jar

EXPOSE 8085

CMD ["java", "-jar", "./target/feign-service-0.0.1-SNAPSHOT.jar"]