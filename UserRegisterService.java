package org.techhub.service;

import org.techhub.model.AdminLogin;
import org.techhub.model.CustomerLogin;
public interface UserRegisterService {
   public  boolean registerUser(CustomerLogin login);
   public boolean registerUser(AdminLogin login);
}
