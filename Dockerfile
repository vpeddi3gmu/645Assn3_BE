FROM maven:3-openjdk-18-slim as builder
WORKDIR /work_dir
COPY . /work_dir
RUN mvn package
RUN mv /work_dir/target/645Assn3-0.0.1-SNAPSHOT.war /work_dir/target/645Assn3.war


FROM tomcat:9.0.56-jdk17-temurin
COPY --from=builder  /work_dir/target/645Assn3.war /usr/local/tomcat/webapps/
LABEL maintainer="vpeddi3@gmu.edu"
EXPOSE 8080/tcp
