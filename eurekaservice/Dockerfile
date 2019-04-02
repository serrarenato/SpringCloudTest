# ===== BUILD =====
FROM maven:3.5.3-jdk-10-slim


RUN mkdir -p /opt/springcloudtest/work
WORKDIR /opt/springcloudtest/work

COPY pom.xml /opt/springcloudtest/work/
COPY ../pom.xml /opt/springcloudtest/
RUN mvn verify clean

COPY . /opt/springcloudtest/work/
RUN mvn install

EXPOSE 7777

RUN mkdir -p /opt/springcloudtest/config
RUN mkdir -p /opt/springcloudtest/application
WORKDIR /opt/springcloudtest

#copying module and executing



COPY --from=build-eureka /opt/springcloudtest/work/target/eureka-server.jar /opt/springcloudtest/application/eureka-server.jar

ENTRYPOINT [ "java", \
				"--add-modules", "java.xml.bind", \
				"-jar", "/opt/springcloudtest/application/matera-eureka-server.jar" \
			]