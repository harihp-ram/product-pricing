package com.preeti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired ProductService productService;

    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Product getProductByIdentifier(@PathVariable(name="id") final Integer productIdentifier) {
    if(productIdentifier!=null)
    	return productService.getProductById(productIdentifier);
    else 
    	return null;
    }
    
    
    @PutMapping(value = "/update/", consumes = {MediaType.APPLICATION_JSON_VALUE }, 
    			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Product updateProductByIdentifier(@RequestBody Product product) {
    	return productService.updateProductDetails(product);
    }
    
    
}