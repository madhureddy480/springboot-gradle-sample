package com.jay.sample.swagger;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.jay.sample.controller")).paths(regex("/api.*")).build();
	}

//	private Predicate<String> postPaths() {
//		//return or(regex("/api/agencies.*"), regex("/api/agents.*"));
//		return or(regex("/*"));
//	}
//
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title("Swagger API")
//				.description("Description - Contact Dev Team")
//				.contact("devteam@gmail.com").license("companyname.com License")
//				.licenseUrl("devteam@gmail.com").version("1.0").build();
//	}

}
