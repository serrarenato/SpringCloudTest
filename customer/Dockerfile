# ===== BUILD =====
FROM java:8
ARG EUREKA_SERVER

RUN mkdir -p /opt/springcloudtest/work
WORKDIR /opt/springcloudtest/work

ENV EUREKA_URI=${EUREKA_SERVER}

ADD /target/customer.jar /opt/springcloudtest/work/customer.jar


EXPOSE 8080

#copying module and executing



ENTRYPOINT [ "java", "-jar", "customer.jar"]
