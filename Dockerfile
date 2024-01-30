FROM openjdk:17

COPY app2.jar MyApp.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "MyApp.jar"]

