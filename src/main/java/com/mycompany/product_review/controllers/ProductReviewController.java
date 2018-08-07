package com.mycompany.product_review.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.product_review.service.ProductReviewRequest;
import com.mycompany.product_review.service.ProductReviewResponse;

@RestController
@RequestMapping("/api/reviews")
public class ProductReviewController
{
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ProductReviewResponse submit(@RequestBody ProductReviewRequest productReviewRequest)
	{
		Integer reviewId = null;
		Boolean success = true;
		try
		{
			System.out.println(productReviewRequest.getReviewerName());
			System.out.println(productReviewRequest.getEmail());
			System.out.println(productReviewRequest.getProductId());
			System.out.println(productReviewRequest.getReviewText());
		}
		catch (Exception e)
		{
			success = false;
		}

		return new ProductReviewResponse(success, reviewId);
		
	}

	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public String status()
	{
		return "{\"status\"=\"alive\"}";
	}
}
