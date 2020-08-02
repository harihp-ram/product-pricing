package com.preeti.feign.clients;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.preeti.feign.ProductControllerFeignClientBuilder;
import com.preeti.feign.client.ProductClient;
import com.preeti.feign.models.CurrencyCode;
import com.preeti.feign.models.Price;
import com.preeti.feign.models.Product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(JUnit4.class)
public class ProductClientTest {
	private ProductClient productClient;

	@Before
	public void setup() {
		ProductControllerFeignClientBuilder feignClientBuilder = new ProductControllerFeignClientBuilder();
		productClient = feignClientBuilder.getProductClient();
	}

	@Test
	public void givenProductClient_shouldFindOneProduct() throws Exception {
		Product product = productClient.findById(123);
		assertThat(product.getName(), containsString("IPhone"));
	}

	@Test
	public void givenProductClient_shouldPostProduct() throws Exception {
		Integer productIdentifier = 123;
		Product product = new Product();
		product.setId(productIdentifier);
		product.setName("IPhone");
		product.setCurrentPrice(new Price(BigDecimal.valueOf(200.22),CurrencyCode.USD));
		productClient.updateProduct(product);
		assertThat(product.getName(), containsString("IPhone"));
		assertThat(product.getCurrentPrice().getValue(),equalTo(BigDecimal.valueOf(200.22)));
		
	}

}