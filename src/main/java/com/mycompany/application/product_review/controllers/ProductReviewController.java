package com.mycompany.application.product_review.controllers;

import java.sql.SQLException;
import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.api.product_review.ProductReviewResponse;
import com.mycompany.api.product_review.UserReview;
import com.mycompany.model.product_review.ProductReview;
import com.mycompany.service.product_review.ProductReviewService;

@RestController
@RequestMapping("/api/reviews")
public class ProductReviewController
{
	
	private final Logger logger = LoggerFactory.getLogger(ProductReviewController.class);
	
	@Autowired
	private ProductReviewService productReviewService;
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ProductReviewResponse submit(@Valid @RequestBody UserReview userReview)
	{
		ProductReviewResponse response = new ProductReviewResponse(false, -1);

		try
		{
			ProductReview productReview = productReviewService.createProductReview(userReview);
			productReviewService.publishToSubmittedQueue(productReview.getProductReviewID());
			
			response.setReviewId(productReview.getProductReviewID());
			response.setSuccess(true);
		}
		catch (Exception e)
		{
			UUID errorID = UUID.randomUUID();
			logger.error("Error while submiting review (" + errorID.toString() + ")", e);
			response.setErrorMessage("Error while submiting review. Error code is " + errorID.toString());
		}

		return response;
		
	}

	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public String status() throws SQLException, ClassNotFoundException
	{
		return "{\"status\"=\"alive\"}";
	}
}
