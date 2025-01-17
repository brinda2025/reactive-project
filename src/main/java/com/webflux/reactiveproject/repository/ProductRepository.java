package com.webflux.reactiveproject.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.webflux.reactiveproject.entity.Product;

@Repository
public interface ProductRepository extends R2dbcRepository<Product,String>{

}
