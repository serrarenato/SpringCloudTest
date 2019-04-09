# ===== BUILD =====
FROM java:8


RUN mkdir -p /opt/springcloudtest/work
WORKDIR /opt/springcloudtest/work


ADD /target/zuulservice.jar /opt/springcloudtest/work/zuulservice.jar


EXPOSE 7772

#copying module and executing



ENTRYPOINT [ "java", "-jar", "zuulservice.jar"]
