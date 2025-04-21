package com.example.serviceA.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Service A API", version = "v1"))
public class OpenApiConfig {
    // Optional: Add any additional Swagger configuration here
}