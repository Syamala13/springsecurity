# Use an official OpenJDK runtime as a base image with Java 8
FROM openjdk:8-jre-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY target/test.jar /app

# Specify the command to run your application
CMD ["java", "-jar", "test.jar"]
