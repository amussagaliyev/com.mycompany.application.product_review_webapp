package com.mycompany.api.product_review;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserReview
{
	@JsonProperty("productid")
	private Integer productId;

	@JsonProperty("name")
	private String reviewerName;

	@JsonProperty("email")
	private String reviewerEmailAddress;

	@JsonProperty("review")
	private String reviewText;
	
	public Integer getProductId()
	{
		return productId;
	}
	public void setProductId(Integer productId)
	{
		this.productId = productId;
	}
	public String getReviewerName()
	{
		return reviewerName;
	}
	public void setReviewerName(String reviewerName)
	{
		this.reviewerName = reviewerName;
	}
	public String getReviewerEmailAddress()
	{
		return reviewerEmailAddress;
	}
	public void setReviewerEmailAddress(String reviewerEmailAddress)
	{
		this.reviewerEmailAddress = reviewerEmailAddress;
	}
	public String getReviewText()
	{
		return reviewText;
	}
	public void setReviewText(String reviewText)
	{
		this.reviewText = reviewText;
	}
	
	
	
}
