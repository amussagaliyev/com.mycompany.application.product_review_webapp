package com.mycompany.product_review.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.log.LogTrace;
import com.mycompany.product_review.bean.ProductReview;
import com.mycompany.product_review.dao.ProductReviewDao;
import com.mycompany.product_review.service.ProductReviewResponse;
import com.mycompany.queue.Message;
import com.mycompany.queue.MessageBroker;

@RestController
@RequestMapping("/api/reviews")
public class ProductReviewController
{
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ProductReviewResponse submit(@RequestBody ProductReview productReview)
	{
		Integer reviewId = null;
		Boolean success = true;
		try
		{
			ProductReviewDao.save(productReview);
			reviewId = productReview.getId();
			MessageBroker.push(new Message());
		}
		catch (Exception e)
		{
			LogTrace.error(e, "ProductReviewController.submit", e.getMessage(), null);
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
