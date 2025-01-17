package com.webflux.reactiveproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webflux.reactiveproject.dto.*;
import com.webflux.reactiveproject.repository.ProductRepository;
import com.webflux.reactiveproject.utils.AppUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
 @Autowired	
private ProductRepository repository;
 
 public Flux<ProductDto> getProducts() {
	return repository.findAll().map(AppUtils::entityToDto);
	 
 }
 
 public Mono<ProductDto> getProduct(String id) {
	return repository.findById(id).map(AppUtils::entityToDto);
	 
 }
 

}
