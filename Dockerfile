FROM openjdk:17
ADD target/spring-devops.jar spring-devops.jar
ENTRYPOINT ["JAVA", "-JAR", "/spring-devops.jar"]