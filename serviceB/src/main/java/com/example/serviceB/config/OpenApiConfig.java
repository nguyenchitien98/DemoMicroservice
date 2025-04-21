package com.example.serviceB.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Service B API", version = "v2"))
public class OpenApiConfig {
    // Optional: Add any additional Swagger configuration here
}