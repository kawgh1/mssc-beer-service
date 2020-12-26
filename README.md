##### Part of John Thompson's Microservices course

CircleCI badge 
   - [![CircleCI](https://circleci.com/gh/kawgh1/mssc-beer-service.svg?style=svg)](https://circleci.com/gh/kawgh1/mssc-beer-service)

# MSSC Beer Service - Microservice

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

# Default Port Mappings - For Single Host
| Service Name | Port | 
| --------| -----|
| Brewery Beer Service | 8080 |
| [Brewery Beer Order Service](https://github.com/kawgh1/mssc-beer-order-service) | 8081 |
| [Brewery Beer Inventory Service](https://github.com/kawgh1/mssc-beer-inventory-service) | 8082 |

