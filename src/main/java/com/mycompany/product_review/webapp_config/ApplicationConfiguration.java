package com.mycompany.product_review.webapp_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.malwarebytes.product_review")
public class ApplicationConfiguration
{

}
