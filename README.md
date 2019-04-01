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


Acessando Eureka: http://localhost:7777
I change default port of Eureka(8761) only to test.
````
Instances currently registered with Eureka

Application	AMIs	Availability Zones	Status
CUSTOMER	n/a (1)	(1)	UP (1) - 10.0.2.86:customer:8080
PRODUCT	n/a (1)	(1)	UP (1) - 10.0.2.86:product:8181
ZUUL-SERVER	n/a (1)	(1)	UP (1) - 10.0.2.86:zuul-server:8082````

## Acessando APIs

#### Diretamente
- http://localhost:8181/products
- http://localhost:8080/customers

#### Via Proxy (Zuul)
- http://localhost:8082/api/product/products/
- http://localhost:8082/api/customer/customers/

