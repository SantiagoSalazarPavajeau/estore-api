package com.ecommerce.store;

public class ProductBean {
	
	private String message;
	
	
	
	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public ProductBean(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
	
}
