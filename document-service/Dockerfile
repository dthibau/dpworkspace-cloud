FROM openjdk:8-jre-alpine
MAINTAINER David THIBAU <david.thibau@gmail.com>

ADD ./target/document-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/document-service.jar"]

EXPOSE 8888
