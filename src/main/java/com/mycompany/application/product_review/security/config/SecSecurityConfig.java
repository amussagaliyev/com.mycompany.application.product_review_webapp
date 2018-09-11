package com.mycompany.application.product_review.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*@Configuration
@ImportResource(
{ "classpath:webSecurityConfig.xml" })
@ComponentScan("com.mycompany")
@EnableWebSecurity
*/public class SecSecurityConfig
{

	public SecSecurityConfig()
	{
		super();
	}

/*	@Bean
*/	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	public static void main(String[] args)
	{
		System.out.println(new BCryptPasswordEncoder().encode("password"));
	}
	
}
