package com.mycompany.product_review.service;

public class ProductReviewResponse
{
	private Boolean success;
	private Integer reviewId;
	
	public ProductReviewResponse(Boolean success, Integer reviewId)
	{
		this.success = success;
		this.reviewId = reviewId;
	}
	public Boolean getSuccess()
	{
		return success;
	}
	public void setSuccess(Boolean success)
	{
		this.success = success;
	}
	public Integer getReviewId()
	{
		return reviewId;
	}
	public void setReviewId(Integer reviewId)
	{
		this.reviewId = reviewId;
	}
	
	
}
