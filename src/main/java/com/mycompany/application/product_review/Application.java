package com.mycompany.application.product_review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories("com.mycompany.model")
@EntityScan("com.mycompany.model")
@ComponentScan("com.mycompany")
@EnableWebMvc
//@EnableWebSecurity
public class Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

}
