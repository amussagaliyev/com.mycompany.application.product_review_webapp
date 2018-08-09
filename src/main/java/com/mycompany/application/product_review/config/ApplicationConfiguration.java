package com.mycompany.application.product_review.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mycompany.api.jedis.RedisQueuePublisher;
import com.mycompany.api.jedis.SimpleRedisConfig;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.mycompany")
public class ApplicationConfiguration
{
	@Bean(name="productReviewQueuePublisher")
	@Scope("singleton")
	public RedisQueuePublisher getProductReviewQueuePublisher()
	{
		return new RedisQueuePublisher(new SimpleRedisConfig());
	}
}
