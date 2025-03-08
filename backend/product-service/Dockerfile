# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

LABEL authors="sivareddy"

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR file from the target directory into the container
COPY target/product-service.jar product-service.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "product-service.jar"]