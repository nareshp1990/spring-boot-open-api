package com.open.api.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Open API Example")
                        .version("v1.0")
                        .description("Spring Boot Open API document generation")
                        .contact(new Contact()
                                .name("Naresh Patchipulusu")
                                .email("patchipulusu.naresh@gmail.com")
                                .url("https://springdoc.org/")))
                .servers(Arrays.asList(
                        new Server().url("http://localhost:8080/").description("Development Server"),
                        new Server().url("http://localhost:8080/").description("Production Server")));
    }

}
