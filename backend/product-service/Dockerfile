# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

LABEL authors="sivareddy"

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR file from the target directory into the container
COPY target/ProductService-0.0.1-SNAPSHOT.jar product-service.jar

# Expose the application port
EXPOSE 8080

# Set environment variables for MongoDB (used in Kubernetes)
ENV MONGO_HOST=mongodb-service
ENV MONGO_PORT=27017
ENV MONGO_DB=product_db
ENV MONGO_USER=root
ENV MONGO_PASS=root

# Run the application
ENTRYPOINT ["java", "-jar", "product-service.jar"]