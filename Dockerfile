# Utilizar una imagen base con Java 8 y Maven
FROM maven:3.8.4-openjdk-8

# Set the working directory in the container
WORKDIR /usercrud

# Copiar los archivos de configuración del proyecto
COPY pom.xml .
COPY src ./src

# Empaquetar la aplicación
RUN mvn package -DskipTests

# Expose the port on which the application will run
EXPOSE 8018

# Set the startup command to run the application
CMD ["java", "-jar", "target/usercrud-0.0.1-SNAPSHOT.jar"]