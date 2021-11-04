package com.hitss.pis.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Pis Rest API", version = "1.0", description = "Information of PIs from service rest"))
@PropertySources({@PropertySource("classpath:webservices-dev.properties")})
public class PisRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PisRestApplication.class, args);
	}
	
//	@Bean
//	public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption,
//			@Value("${application-version}") String appVersion) {
//		return new OpenAPI()
//				.info(new Info()
//				.title("sample application API")
//				.version(appVersion)
//				.description(appDesciption)
//				.termsOfService("http://swagger.io/terms/")
//				.license(new License().name("Apache 2.0")
//				.url("http://springdoc.org")));
//	}

}
