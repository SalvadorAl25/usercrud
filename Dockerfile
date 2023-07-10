# Use an official OpenJDK runtime as the base image
FROM openjdk:8-jdk-alpine

# Set the working directory in the container
WORKDIR /usercrud

# Copy the Maven wrapper files (pom.xml and the wrapper scripts)
COPY mvnw .
COPY .mvn .mvn

# Copy the project source code
COPY src src

# Copy the configuration files
COPY pom.xml .

# Build the application with Maven
RUN ./mvnw install -DskipTests

# Expose the port on which the application will run
EXPOSE 8018

# Establecer las variables de entorno para la conexión a MySQL
ENV SPRING_DATASOURCE_URL jdbc:mysql://localhost:3306/apiresttest
ENV SPRING_DATASOURCE_USERNAME root
ENV SPRING_DATASOURCE_PASSWORD 0troSentido26.

# Set the startup command to run the application
CMD ["java", "-jar", "target/usercrud-0.0.1-SNAPSHOT.jar"]