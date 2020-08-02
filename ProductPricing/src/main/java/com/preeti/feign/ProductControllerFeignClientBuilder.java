package com.preeti.feign;

import com.preeti.feign.client.ProductClient;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import lombok.Getter;

@Getter
public class ProductControllerFeignClientBuilder {

	private ProductClient productClient = createClient(ProductClient.class, "http://localhost:8080/");
	
	private static <T> T createClient(Class<T> type, String uri) {
		return Feign.builder().client(new OkHttpClient())
				.encoder(new GsonEncoder())
				.decoder(new GsonDecoder())
				.logger(new Slf4jLogger(type))
				.logLevel(Logger.Level.FULL)
				.target(type,uri);
	}

	public ProductClient getProductClient() {
		return this.productClient;
	}
}
