# Spring Cloud Test

A simple project with Eureka, Zuul and 2 microservices, Customer and Product, both are registred in Eureka and Zuul.

## Pré requisito
- Maven 3
- Java 8

## Preparando ambiente

- ```cd springcloudtest```
- ```mvn clean package```

## Executando 

Service Discovery (Eureka)
- ```cd eureka-service```
- ```mvn spring-boot:run```

Proxy (Zuul)
- ```cd zuul```
- ```mvn spring-boot:run```

API de Customers
- ```cd customer```
- ```mvn spring-boot:run```

API de Products
- ```cd product```
- ```mvn spring-boot:run```

API de SpringMonitor
- ```cd springmonitor```
- ```mvn spring-boot:run```

Ou se preferir pode ser usado o docker para subir todos so microserviços:
docker-compose up -d


Acessando Eureka: http://localhost:7777
I change default port of Eureka(8761) only to test.
````
Instances currently registered with Eureka

Application	AMIs	Availability Zones	Status
CUSTOMER	n/a (1)	(1)	UP (1) - 3f7ede771995:customer:8080
PRODUCT	n/a (1)	(1)	UP (1) - d20fe17d69ba:product:8181
SPRINGMONITOR	n/a (1)	(1)	UP (1) - ef4ecc97967e:springmonitor:7771
ZUUL-SERVER	n/a (1)	(1)	UP (1) - ce1baa53068d:zuul-server:7772


## Acessando APIs

#### Diretamente
- http://localhost:8181/products
- http://localhost:8080/customers

#### Via Proxy (Zuul)
- http://localhost:8082/api/product/products/
- http://localhost:8082/api/customer/customers/

