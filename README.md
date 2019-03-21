# realestate_monolith
A springboot application about real estate transactions which is deved with traditional monolithic way, and will be refactored again with micro services.

## Monolith Project Build
+ Java Development + Maven
+ SpringBoot integrates Mybatis
+ SpringBoot integrates Freemarker
+ SpringBoot core
+ Self-Defined SpringBoot Starter

## User Module
+ Spring interceptor for Authentication
+ Guava Cache for local cache
+ Spring Mail as Mail Sender
+ Spring MVC

## Agent Module
+ Encapsulate Paging components on Server side
+ Error Pages, integrated exception handling
+ Spring Boot Unit Tests

## Real Estate Module
+ ResponseBody annotation for ingesting json
+ Ajax
+ Spring Events annotations

## Refer Module
+ Redis with Lists
+ Popular recommendation
+ Recent real estate sources

## Monitor and Deployment
+ Spring Boot plugins packaging
+ Spring Boot Actuator
+ Spring Admin monitoring platform  


## Versions
#### SpringBoot 2.1.2
#### MySQL 8.0.12
#### Druid 1.1.13
#### Guava 27.0.1-jre
#### Springboot Freemarker 2.1.3
