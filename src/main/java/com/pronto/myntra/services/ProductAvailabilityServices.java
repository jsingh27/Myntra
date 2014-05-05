package com.pronto.myntra.services;

import com.pronto.myntra.domain.Product;
import com.pronto.myntra.domain.User;

public class ProductAvailabilityServices {
	public Boolean orderProduct(String productID, int userID) {
		ProductServices productService = new ProductServices();
		Product product = productService.findProductById(productID);

		UserServices userService = new UserServices();
		User user = userService.findUserById(userID);

		if (product.getQuantity() <= 0)
			return false;
		else

			return true;

	}
}
