package com.preeti.feign.client;

import java.util.List;

import com.preeti.feign.models.Product;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface ProductClient {
	@RequestLine("GET /product/{id}")
	Product findById(@Param(value = "id") Integer identifier);

	@RequestLine("GET /product/all")
	List<Product> findAll();

	@RequestLine("PUT /product/update/")
	@Headers("Content-Type: application/json")
	Product updateProduct(Product product);
}
