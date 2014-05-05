package com.pronto.myntra.services;

import com.pronto.myntra.domain.User;

public class UserServices {
	public User findUserById(int ID) {
		User user = new User();
		user.setID(ID);
		return user;
	}

}
