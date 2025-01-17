package com.webflux.reactiveproject.utils;

import org.springframework.beans.BeanUtils;

import com.webflux.reactiveproject.dto.ProductDto;
import com.webflux.reactiveproject.entity.Product;

public class AppUtils {

	
	public static ProductDto entityToDto(Product product) {
		
		ProductDto 	productDto = new ProductDto();
		BeanUtils.copyProperties(product, productDto);
		
		return productDto;


	}
	
	
	public static Product DtoToEntity(ProductDto productDto)
	
	{
		Product product = new Product();
		BeanUtils.copyProperties(productDto, product);
		return product;
		
	}
}
