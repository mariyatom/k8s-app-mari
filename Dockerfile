FROM openjdk:11

EXPOSE 8080

# Copy the jar file into the container
COPY target/k8s-app-mari-0.0.1-SNAPSHOT.jar k8s-app-mari-0.0.1-SNAPSHOT.jar

# Set the entry point to run the jar
ENTRYPOINT ["java", "-jar", "/k8s-app-mari-0.0.1-SNAPSHOT.jar"]
