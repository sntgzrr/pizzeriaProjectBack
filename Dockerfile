FROM maven:3.8.1-openjdk-17 AS build
WORKDIR /app
COPY . /app
RUN mvn clean package -DskipTests

FROM openjdk:17
EXPOSE 8080
COPY --from=build /app/target/Back-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]