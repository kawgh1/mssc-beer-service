##### Part of John Thompson's Microservices course

# Default Port Mappings - For Single Host
| Service Name | Port | 
| --------| -----|
| [Brewery Beer Service](https://github.com/kawgh1/mssc-beer-service) | 8080 |
| [Brewery Beer Order Service](https://github.com/kawgh1/mssc-beer-order-service) | 8081 |
| [Brewery Beer Inventory Service](https://github.com/kawgh1/mssc-beer-inventory-service) | 8082 |

CircleCI badge 
   - [![CircleCI](https://circleci.com/gh/kawgh1/mssc-beer-service.svg?style=svg)](https://circleci.com/gh/kawgh1/mssc-beer-service)

# MSSC Beer Service - Microservice

### Ehcache

- https://www.baeldung.com/ehcache
- Ehcache utilizes Java's on-heap RAM memory to store cache entries
- this application will use Ehcache - very popular, robust and one of the top Java caching managers
- will add caching layer for listBeers, getBeerById and getBeerByUpc  - Ehcache is a good candidate because the beer information isn't going to change that much
- what it will do?
    - provide fast access to the Beer data while avoiding a call to the database 
    - significantly improves the performance of our getBeer APIs
    - here we set it up to only run when we are NOT getting BeerInventory information
        - because inventory is dynamic and changes often and quickly
        
- each running instance is going to have its own local cache, so if you have 3 instances running you have 1 in 3 chance of getting a cache response
- there are technologies available where instances can share a cache 
- Ehcache can be configured so that if you do have multiple instances running, it reads from a single cache





### Spring MVC REST Docs
- **What is it?** A tool for generating API documentation from controller tests
- Developed by Andy Wilkinson of Pivotal
- Spring REST Docs hooks into controller tests to generate documentation snippets
- ***Idea being - as soon as your controller tests fail, your API Docs fail also, so there's no delay***
- The snippets are then assembled into final documentation via AsciiDoctor
- Test Clients Supported:
    - Spring MVC Test
    - WebTestClient (WebFlux)
    - REST Assured
    
- Spring REST Docs supports the following testing frameworks:
    - JUnit 5, JUnit 4
    - Spock
    - Test NG (additional configuration required)
    
- Default Snippets
    - curl-request
    - http-request
    - http-response
    - httpie-request
    - request-body
    - response-body
    
- Spring REST Doc Options
    - Can optionally use Markdown rather than AsciiDoctor
    - Maven and Gradle may be used for the build process
    - You can package the documentation to be served as static content via Sping Boot
    - Extensive options for customizing AsciiDoctor output
    
- Third Party Extensions

    - restdocs-wiremock - Auto generate WireMock Stubs
    - restdocsext-jersey - Enable use of REST Docs with Jersey's test framework
    - spring-auto-restdocs - Use reflection to automatically document request and response params
    - restdocs-api-spec - Generate OpenAPI 2 and OpenAPI 3 specifications



