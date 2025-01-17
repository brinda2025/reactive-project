package com.webflux.reactiveproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.webflux.reactiveproject.dto.*;

import com.webflux.reactiveproject.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {
	
@Autowired
private ProductService productService;

@GetMapping
public Flux<ProductDto> getProducts(){
	
	return productService.getProducts();
}

@GetMapping("/{id}")
public Mono<ProductDto> getProduct(@PathVariable String id){
	return productService.getProduct(id);

	
}


}
