//package com.imode.config;
//
//import com.sun.xml.bind.v2.schemagen.xmlschema.Appinfo;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Collections;
//
//@SpringBootApplication
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    AppinfO apiInfo()
//    {
//        return new ApiInfo(
//                "Cron Service for Spring Boot Template",
//                "This service has the template for Spring Boot",
//                "1.0",
//                "Credentials will be provided for making API calls",
//                new Contact("Isaac Oghenevwapo",
//                        "https://hyzic23.com",
//                        "isaac.oghenevwapo@gmail.com"),
//                "The Apache Software License, Version 2.0",
//                "https://www.apache.org/licenses/LICENSE-2.0.txt",
//                Collections.EMPTY_LIST
//        );
//    }
//
//
//}
