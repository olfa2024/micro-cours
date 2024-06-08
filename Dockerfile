# Build stage
FROM maven:3.6-openjdk-17 as builder
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -q -Dmaven.test.skip=true -f /home/app/pom.xml clean package

# Package stage
FROM openjdk:17
COPY --from=builder /home/app/target/cours.jar /usr/local/lib/cours.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "/usr/local/lib/cours.jar"]
