FROM eclipse-temurin:17-jdk-jammy
COPY build/libs/*.jar ./wfa.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "wfa.jar"]