# ===== BUILD =====
FROM java:8


RUN mkdir -p /opt/springcloudtest/work
WORKDIR /opt/springcloudtest/work


ADD /target/springmonitor.jar /opt/springcloudtest/work/springmonitor.jar


EXPOSE 7771

#copying module and executing



ENTRYPOINT [ "java", "-jar", "springmonitor.jar"]
