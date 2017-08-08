This project is a demonstration of intelligent routing or a gateway service or the api gateway.

In order to be dynamic and scalable as possible, a cloud native application is made up of individual services. As a user of these services, remembering the locations of all of the individual services would be a nightmare.

A Gateway service is the entry point for a system and it provides the following functionalities:

1) Dynamic Routing and delivery
2) Security and Filtering
3) Auditing and logging of requests
4) Request enhancement
5) Load balancer
6) Different apis for different types of clients, such a web client and a mobile client.

Intelligent routing is implemented using a combination of Spring Cloud and Netflix Zuul project.

The annotation "@EnableZuulProxy" turns the application into the gateway service.

In order to quickly bootstrap it, go to http://start.spring.io/ and use the Spring Initializr to stub it out.
Generate it with the dependencies Eureka Discovery and zuul.
