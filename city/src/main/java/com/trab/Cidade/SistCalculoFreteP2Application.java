package com.trab.Cidade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example" })
@EntityScan(basePackages = { "com.example" })
public class SistCalculoFreteP2Application {
	public static void main(String[] args) {
		SpringApplication.run(SistCalculoFreteP2Application.class, args);

	}
}
