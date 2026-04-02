FROM openjdk:17-alpine
COPY build/libs/*.jar ./wfa.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "wfa.jar"]