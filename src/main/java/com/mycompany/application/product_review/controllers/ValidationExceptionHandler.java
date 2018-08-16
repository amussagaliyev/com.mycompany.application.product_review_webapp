package com.mycompany.application.product_review.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mycompany.api.product_review.ProductReviewResponse;

@ControllerAdvice
public class ValidationExceptionHandler extends ResponseEntityExceptionHandler 
{
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
		BindingResult bindingResult = ex.getBindingResult();
		
		String errorMessage = "Invalid value(s) provided: ";
		
		for (FieldError fieldError : bindingResult.getFieldErrors())
		{
			errorMessage += "[" + fieldError.getDefaultMessage() + " : " + fieldError.getRejectedValue() + "]";
		}
		
		for (ObjectError objectError : bindingResult.getGlobalErrors())
		{
			errorMessage += "[" + objectError.getCode() + "]";
		}
		
		ProductReviewResponse response = new ProductReviewResponse(false, -1);
		response.setErrorMessage(errorMessage);
		
		return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
	}
}
