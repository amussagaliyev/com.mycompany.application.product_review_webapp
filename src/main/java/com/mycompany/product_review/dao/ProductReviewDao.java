package com.mycompany.product_review.dao;

import com.mycompany.db.Db;
import com.mycompany.product_review.bean.ProductReview;

public class ProductReviewDao
{

	public static ProductReview getByID(Integer id)
	{
		return Db.session().get(ProductReview.class, id);
	}
	
	public static void save(ProductReview productReview)
	{
		Db.session().saveOrUpdate(productReview);
	}
}
