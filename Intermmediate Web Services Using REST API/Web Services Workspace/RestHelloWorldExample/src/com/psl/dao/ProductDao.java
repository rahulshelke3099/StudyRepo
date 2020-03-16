package com.psl.dao;

import java.util.HashMap;

import com.psl.bean.Product;

public interface ProductDao {

	public Product getProductById(String productId);
	public HashMap<String, Product> getAllProducts();
	public Product updatePrice(String productId, String productPrice);
	public Product deleteProductById(String productId);

}