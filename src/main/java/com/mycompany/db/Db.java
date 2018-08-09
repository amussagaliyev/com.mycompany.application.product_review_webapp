package com.mycompany.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Db
{
	private static SessionFactory sessionFactory;
    
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		Db.sessionFactory = sessionFactory;
	}
	
    public static SessionFactory sessionFactory() 
    {
        return sessionFactory;
    }

    public static Session currentSession()
    {
    	return sessionFactory().getCurrentSession();
    }
    
    
}
