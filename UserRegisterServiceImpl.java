package org.techhub.service;

import org.techhub.model.AdminLogin;
import org.techhub.model.CustomerLogin;
import org.techhub.repository.UserRegisterRepository;
import org.techhub.repository.UserRegisterRepositoryImpl;


public class UserRegisterServiceImpl implements UserRegisterService {
	
	UserRegisterRepository regRepo=new UserRegisterRepositoryImpl();

	public boolean registerUser(CustomerLogin login) {

		return  regRepo.registerUser(login);
	}


	public boolean registerUser(AdminLogin login) {
		// TODO Auto-generated method stub
		return false;
	}

}
