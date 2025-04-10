package org.techhub.service;

import java.util.List;

import org.techhub.model.Product;

public interface ProductService {
	public boolean isAddNewProduct(Product model);
	public List getAllProducts();
	}


