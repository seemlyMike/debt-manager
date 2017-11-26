FROM java:8
VOLUME /tmp
ADD target/debt-manager-0.0.1-SNAPSHOT.jar debt-manager.jar
EXPOSE 8080
RUN bash -c 'touch /debt-manager.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dspring.data.mongodb.uri=mongodb://mongodb/debt-manager -Djava.security.egd=file:/dev/./urandom -jar /debt-manager.jar"]