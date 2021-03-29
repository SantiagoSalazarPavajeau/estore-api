package com.ecommerce.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@GetMapping(path= "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	
	@GetMapping(path= "/product-bean")
	public ProductBean productBean() {
		return new ProductBean("Cuchufly");
	}
	
	@GetMapping(path= "/product-bean/path-variable/{name}")
	public ProductBean productBean(@PathVariable String name) {
		return new ProductBean(String.format("Cuchufly, %s", name));
	}
	
}
