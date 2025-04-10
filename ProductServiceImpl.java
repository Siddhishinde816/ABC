package org.techhub.service;

import java.util.List;

import org.techhub.model.Product;
import org.techhub.repository.ProductRepository;
import org.techhub.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService{

	ProductRepository prodRepo=new ProductRepositoryImpl();


	@Override
	public boolean isAddNewProduct(Product model) {
		return prodRepo.isAddNewProduct(model);
	}
   public List getAllProducts() {
	   return prodRepo.getAllProducts();
   }
}
