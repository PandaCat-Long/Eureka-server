#PandaCat's DockerFiles

FROM java:jdk-alpine

MAINTAINER PandaCat <626668988@qq.com>

ADD target/eureka-server-0.0.1-SNAPSHOT.jar app.jar

#RUN bash -c 'touch /app.jar'

EXPOSE 8761

#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

ENTRYPOINT ["java","-jar","/app.jar"]
