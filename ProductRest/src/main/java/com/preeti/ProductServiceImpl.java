package com.preeti;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

	private HashMap<Integer,Product> productMap = new HashMap<>();
	
	@Override
	public Product getProductById(final Integer productIdentifier) {
		System.out.println("Received a request:"+productIdentifier);
		productMap.put(productIdentifier,new Product(productIdentifier,"IPhone",new Price(BigDecimal.valueOf(123.1d),CurrencyCode.USD)));
		return productMap.get(productIdentifier);
	}

	@Override
	public Product updateProductDetails(Product product) {
		productMap.put(product.getId(),new Product(product.getId(),"IPhone",new Price(BigDecimal.valueOf(123.1d),CurrencyCode.USD)));
		if(productMap.get(product.getId())!=null) {
			productMap.remove(product.getId());
			System.out.println("Price:"+product.getCurrentPrice().getValue());
			productMap.put(product.getId(),product);
			return product;
		}
		else {
			System.out.println("Handle Exceptions");
			return product;
		}
		
		
	}

}
