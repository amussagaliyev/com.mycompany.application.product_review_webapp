package com.mycompany.product_review.service;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ProductReviewRequest
{
	private String reviewerName;
	private String email;
	private Integer productId;
	private String reviewText;
	
	@JsonGetter("name")
	public String getReviewerName()
	{
		return reviewerName;
	}

	@JsonSetter("name")
	public void setReviewerName(String reviewerName)
	{
		this.reviewerName = reviewerName;
	}

	@JsonGetter("email")
	public String getEmail()
	{
		return email;
	}
	@JsonSetter("email")
	public void setEmail(String email)
	{
		this.email = email;
	}
	@JsonGetter("productId")
	public Integer getProductId()
	{
		return productId;
	}
	@JsonSetter("productId")
	public void setProductId(Integer productId)
	{
		this.productId = productId;
	}
	@JsonGetter("review")
	public String getReviewText()
	{
		return reviewText;
	}
	@JsonSetter("review")
	public void setReviewText(String reviewText)
	{
		this.reviewText = reviewText;
	}
	
	
	
}
