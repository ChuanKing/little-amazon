This Application is Demo to use spring cloud

1. spring boot
2. spring cloud configure server
3. spring cloud Eureka server
4. spring cloud Ribbon
5. spring cloud Feign
6. spring cloud Hystrix
7. spring cloud bus
8. spring cloud zuul

How to run application

1. go to ConfigData folder do git init
2. start rabbitmq-server
3. run ConfigServer
4. run EurekaServer
5. run BookStore
   run ElectronicStore
   run HomeKitchenStore
6. run APIGateway


Note for spring cloud

1. config server
    1. server
        1. pom.xml: spring-cloud-config-server
        2. application.properties: spring.cloud.config.server.git.uri
        3. Application class @EnableConfigServer
    2. client
        1. pom.xml: spring-cloud-starter-config
        2. bootstrap.properties: 
            1. spring.application.name
            2. spring.cloud.config.uri
    3. git
        1. filename: <spring.application.name>-<profile>.properties (profile is application in different mode)
    4. note
        1. config server can over write the local setting. so you can make a local property file as fallback

2. Eureka server
    1. server
        1. pom.xml: spring-cloud-starter-eureka-server
        2. application.properties: 
            1. server.port
            2. eureka.client.service-url.defaultZone=http://localhost:8010/eureka/
            3. eureka.client.register-with-eureka=false
            4. eureka.client.fetch-registry=false
            5. logging.level.com.netflix.eureka=OFF
            6. logging.level.com.netflix.discovery=OFF
        3. Application class @EnableEurekaServer
    2. client
        1. pom.xml: spring-cloud-eureka-server
        2. application.properties: eureka.client.service-url.defaultZone=http://localhost:8010/eureka/
        3. Application class @EnableDiscoveryClient
        4. in service layer
            1. @Autowired DiscoveryClient discoveryClient
            2. discoveryClient.getInstances(applicationName);
    3. note
        1. better to run different zone
        2. eureka and config server can be configured to be first

3. Ribbon
    1. instance
        1. pom.xml: spring-cloud-start-ribbon
        2. application.properties: spring.cloud.config.server.git.uri
        3. in dao layer 
            1. version 1
                1. @LoadBalanced to RestTemplate Bean
            2. version 2
                1. @Autowired LoadBalancerClient loadBalancer
                2. loadBalancer.choose(“”)
    2. note
        1. can caching and batching
        2. can support multi protocols 
        3. Eureka start same instance use: eureka.instance.instanceId=${spring.application.name}:${spring.application.instance_id:${random.value}}

4. Feign
    1. instance
        1. pom.xml: spring-cloud-starter-feign
        2. Application @EnableFeignClients
        3. create interface 
            1. add @FeignClient with service ID
            2. add method with @GetMapping

5. Hystrix
    1. pom.xml: spring-cloud-starter-hystrix
    2. application: @EnableHystrix
    3. service: @HystrixCommand and fallback function
    4. note
        1. hystrix property Nneka library


6. cloud bus
    1. config-server
        1. pom.xml: spring-cloud-starter-bus-amqp
    2. client-server
        1. pom.xml: spring-cloud-starter-bus-amqp
        2. add @RefreshScope or @ConfigurationProperties



7. zuul
    1. instance
        1. pom.xml: spring-cloud-starter-zuul
        2. application: @EnableZuulProxy
    2. ETag
        1. add @Bean ShallowEtagHeaderFilter
    3. note
        1. add prefix: zuul.prefix: /services
        2. change url: zuul.routes.<new-name>.url=<instance-location>
        3. add filter: create new class and extend ZuulFilter



