FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/MavenDockerJenkins-0.0.1-SNAPSHOT.jar MavenDockerJenkins-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/MavenDockerJenkins-0.0.1-SNAPSHOT.jar"]