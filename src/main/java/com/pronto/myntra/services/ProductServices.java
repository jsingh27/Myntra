package com.pronto.myntra.services;

import com.pronto.myntra.domain.Product;

public class ProductServices {
	public Product findProductById(String ID) {
		Product product = new Product();
		product.setID(ID);
		return product;
	}

}
