package com.productservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.productservice.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> getProductList() {
		Product p1 = new Product(1,"Book",35);
		Product p2 = new Product(2,"Book",25);
		Product p3 = new Product(3,"Book",25);
		Product p4 = new Product(4,"Book",55);
		List<Product> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		return list;
	}

}
