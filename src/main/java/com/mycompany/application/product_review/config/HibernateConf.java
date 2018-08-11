package com.mycompany.application.product_review.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConf
{
	//FIXME Connection leak
	@Bean
	@Scope("singleton")
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		//sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan("com.mycompany.model");
		sessionFactory.setConfigLocation(new ClassPathResource("hibernate.cfg.xml"));
		return sessionFactory;

	}

/*	@Bean
	public DataSource dataSource()
	{
		try
		{
			DataSource dataSource = (DataSource) new InitialContext().lookup("java:/comp/env/jdbc/mycompanyDS");
			return dataSource;
		} catch (NamingException e)
		{
			throw new RuntimeException("Could not get Data Source from context", e);
		}
	}
*/
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
	{

		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);

		return txManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation()
	{
		return new PersistenceExceptionTranslationPostProcessor();
	}
}