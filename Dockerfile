FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/hello-world-docker-boot.jar hello-world-docker-boot.jar
ENTRYPOINT ["sh", "-c", "java -jar hello-world-docker-boot.jar"]