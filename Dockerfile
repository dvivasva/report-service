FROM openjdk:11.0-oracle
ARG JAR_FILE=build/libs/report-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} report.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/report.jar"]