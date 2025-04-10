package org.techhub.service;

import org.techhub.model.User;
import org.techhub.repository.ValidateUserRepository;
import org.techhub.repository.ValidateUserRepositoryImpl;

public class ValidateUserServiceImpl implements ValidateUserService {
   ValidateUserRepository validateRepo=new ValidateUserRepositoryImpl();
	@Override
	public User validateUser(User user) {
		// TODO Auto-generated method stub
		return validateRepo.validateUser(user);
	}

}
