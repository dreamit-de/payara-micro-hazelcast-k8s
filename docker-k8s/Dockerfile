FROM java:8-jdk

MAINTAINER dreamit

COPY server.jar /server.jar

COPY hazelcast.xml /hazelcast.xml

EXPOSE 8080 5900

ENTRYPOINT ["java", "-jar", "/server.jar", "--hzConfigFile", "/hazelcast.xml"]
