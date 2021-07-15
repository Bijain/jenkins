FROM centos

RUN yum install -y java-11-openjdk
VOLUME /tmp
ADD target/pruebaJenkins.jar app.jar

RUN sh -c 'touch /app.jar'
EXPOSE 1234
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]