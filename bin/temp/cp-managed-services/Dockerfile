FROM openjdk:11.0.10-jre
MAINTAINER dipesh.rane@excellarate.com
COPY build/libs/** /
RUN mv build-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]