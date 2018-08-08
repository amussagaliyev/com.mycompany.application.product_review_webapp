package com.mycompany.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Db
{
	private static SessionFactory sessionFactory;
	
	public static Session session()
	{
		return sessionFactory.openSession();
	}
	
}
