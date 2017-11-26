FROM java:8
VOLUME /tmp
ADD target/debt-manager-0.0.1-SNAPSHOT.jar debtManager.jar
EXPOSE 8080
RUN bash -c 'touch /debtManager.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dspring.data.mongodb.uri=mongodb://mongo/debtManager -Djava.security.egd=file:/dev/./urandom -jar /debtManager.jar"]