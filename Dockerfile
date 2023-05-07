# Use a Java runtime as a base image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/MyTech-UserService.jar /app

# Expose port 8080
EXPOSE 8080

# Set the default command to run when the container starts
CMD ["java", "-jar", "user-0.0.1-SNAPSHOT.jar"]
