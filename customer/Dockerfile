# ===== BUILD =====
FROM java:8


RUN mkdir -p /opt/springcloudtest/work
WORKDIR /opt/springcloudtest/work

ENV EUREKA_URI=http://eureka-server:7777

ADD /target/customer.jar /opt/springcloudtest/work/customer.jar


EXPOSE 8080

#copying module and executing



ENTRYPOINT [ "java", "-jar", "customer.jar"]
