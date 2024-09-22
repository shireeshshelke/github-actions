# Use a base image with OpenJDK
FROM openjdk:21-jdk

# Copy the JAR file from target directory to container
COPY target/*.jar todo-list.jar

# Expose port 8080 for the Spring Boot application
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java","-jar","/todo-list.jar"]
