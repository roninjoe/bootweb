# Overview
This is a minimalist Spring Boot Rest API app.  It contains a single microservice, that can be dockerized, and orchestrated, etc.   The project includes a Maven wrapper (3.6.3), and so can be build without a local Maven install.  The service is "swaggerized", so you can explore the parameters, etc. via the Swagger UI, and can test the service from a browser.

## Build
`mvnw clean install`

## Run
`mvnw spring-boot:run`

## Swagger API
To access the Swagger API, point a browser at `http://localhost:8080/`