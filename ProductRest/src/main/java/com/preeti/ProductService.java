package com.preeti;

public interface ProductService {

	public Product getProductById(final Integer productIdentifier);

	public Product updateProductDetails(Product product);
}
