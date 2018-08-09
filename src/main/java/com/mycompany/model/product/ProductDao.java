package com.mycompany.model.product;

import org.springframework.stereotype.Repository;

import com.mycompany.model.core.AbstractDao;

@Repository
public class ProductDao extends AbstractDao
{
	
	public Product getById(Integer id)
	{
		return session().get(Product.class, id);
	}
}
