# ===== BUILD =====
FROM java:8


RUN mkdir -p /opt/springcloudtest/work
WORKDIR /opt/springcloudtest/work


ADD /target/eureka-server.jar /opt/springcloudtest/work/eureka-server.jar


EXPOSE 7777

#copying module and executing



ENTRYPOINT [ "java", "-jar", "eureka-server.jar"]
