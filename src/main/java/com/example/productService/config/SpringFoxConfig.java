//package com.example.productService.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Arrays;
//
////@EnableSw
//// agger2
//@EnableSwagger2
//@Import(BeanValidatorPluginsConfiguration.class)
//@Configuration
//public class SpringFoxConfig {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build()
//                .securitySchemes(Arrays.asList(securityScheme()))
//                .securityContexts(Arrays.asList(securityContext()));
//    }
//}