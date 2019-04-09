# ===== BUILD =====
FROM java:8
ARG EUREKA_SERVER


RUN mkdir -p /opt/springcloudtest/work
WORKDIR /opt/springcloudtest/work

ENV EUREKA_URI=${EUREKA_SERVER}

ADD /target/product.jar /opt/springcloudtest/work/product.jar


EXPOSE 8081

#copying module and executing



ENTRYPOINT [ "java", "-jar", "product.jar"]
